package com.co.confecamaras.database.Bandeja;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.tasks.RunDataBase;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.co.confecamaras.models.DataBase.getCon;

@AllArgsConstructor
public class QueryGetDatosReimpresion implements Task {

    // Constantes para las claves de almacenamiento del Actor
    public static final String KEY_OPERACION = "NUMERO_OPERACION_LIQ";
    public static final String KEY_RECIBO = "NUMERO_RECIBO_LIQ";

    private final String tipoTramite;
    private final String base;

    @Override
    @Step("{0} obtiene el número de operación y recibo de la tabla mreg_liquidacion para la fecha actual")
    public <T extends Actor> void performAs(T actor) {

        // 1. Obtener y formatear la fecha actual (YYYYMMDD)
        String fechaActual = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        System.out.println("--- Ejecutando Consulta de Liquidación de BD ---");
        System.out.println("Parámetros: ");
        System.out.println("  > Base de Datos (Esquema): " + base);
        System.out.println("  > Fecha de Consulta: " + fechaActual);

        try {
            // 2. Conectar a la base de datos (reutilizando la tarea RunDataBase)
            actor.attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));

            // 3. Ejecutar la consulta dentro de un try-with-resources
            try (Connection con = getCon();
                 PreparedStatement stmt = createPreparedStatement(con, fechaActual)) {

                // 4. Ejecutar y procesar el resultado
                System.out.println("  > Ejecutando sentencia SELECT...");
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String numOperacion = rs.getString("numerooperacion");
                    String numRecibo = rs.getString("numerorecibo");

                    // 5. Almacenar los resultados usando actor.remember()
                    actor.remember(KEY_OPERACION, numOperacion);
                    actor.remember(KEY_RECIBO, numRecibo);

                    // 6. Log y Éxito
                    System.out.println("✅ Consulta de BD finalizada con éxito.");
                    System.out.println("  > Número de Operación obtenido: " + numOperacion);
                    System.out.println("  > Número de Recibo obtenido: " + numRecibo);

                    actor.attemptsTo(LogEvent.recordevent(Reportes.PASSED, "Datos de liquidación obtenidos y almacenados."));

                } else {
                    // Log y Falla si no se encuentran datos
                    System.err.println("❌ ERROR: No se encontró registro para la fecha " + fechaActual);
                    Assert.fail("No se encontraron datos de liquidación para la fecha actual.");
                }

            } catch (SQLException e) {
                System.err.println("❌ ERROR SQL al ejecutar la consulta en la BD. Mensaje: " + e.getMessage());
                e.printStackTrace();
                Assert.fail("Fallo SQL: " + e.getMessage());
            }

        } catch (Exception e) {
            System.err.println("❌ ERROR GENERAL en la tarea GetDatosLiquidacionTask.");
            e.printStackTrace();
            Assert.fail("Fallo general: " + e.getMessage());
        } finally {
            System.out.println("----------------------------------------------");
        }
    }

    /**
     * Helper para crear el PreparedStatement, inyectando la base de datos y los parámetros.
     */
    private PreparedStatement createPreparedStatement(Connection con, String fechaActual) throws SQLException {

        String fullTableName = base + ".mreg_liquidacion";

        // Usamos Placeholders (?) para la fecha y tipotramite
        String query = "SELECT numerooperacion, numerorecibo " +
                "FROM " + fullTableName + " " +
                "WHERE tipotramite = ? AND fecha = ?";

        System.out.println("  > SQL Preparada: " + query);

        PreparedStatement stmt = con.prepareStatement(query);

        // Asignación de parámetros
        stmt.setString(1, tipoTramite);
        stmt.setString(2, fechaActual);

        return stmt;
    }

    // Métodos estáticos de fábrica (para uso legible)
    public static QueryGetDatosReimpresion deCertificadosVirtuales() {
        String basePorDefecto = "sii_manizales";
        String tipoTramite = "certificadosvirtuales";
        return new QueryGetDatosReimpresion (tipoTramite, basePorDefecto);
    }
}
