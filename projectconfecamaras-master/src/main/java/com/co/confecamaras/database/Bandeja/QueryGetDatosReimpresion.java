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

import static com.co.confecamaras.models.DataBase.getCon;

@AllArgsConstructor
public class QueryGetDatosReimpresion implements Task {

    public static final String KEY_OPERACION = "NUMERO_OPERACION_LIQ";
    public static final String KEY_RECIBO = "NUMERO_RECIBO_LIQ";

    private final String tipoTramite;
    private final String base;

    @Override
    @Step("{0} obtiene el número de operación y recibo de la tabla mreg_liquidacion")
    public <T extends Actor> void performAs(T actor) {

        System.out.println("--- Ejecutando Consulta de Liquidación de BD ---");
        System.out.println("Parámetros: ");
        System.out.println("  > Base de Datos (Esquema): " + base);
        System.out.println("  > Tipo trámite: " + tipoTramite);

        try {
            actor.attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));

            try (Connection con = getCon();
                 PreparedStatement stmt = createPreparedStatement(con)) {

                System.out.println("  > Ejecutando sentencia SELECT...");
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {

                    String numOperacion = rs.getString("numerooperacion");
                    String numRecibo = rs.getString("numerorecibo");

                    actor.remember(KEY_OPERACION, numOperacion);
                    actor.remember(KEY_RECIBO, numRecibo);

                    System.out.println("✅ Consulta de BD finalizada con éxito.");
                    System.out.println("  > Número de Operación obtenido: " + numOperacion);
                    System.out.println("  > Número de Recibo obtenido: " + numRecibo);

                    actor.attemptsTo(
                            LogEvent.recordevent(Reportes.PASSED, "Datos de liquidación obtenidos correctamente.")
                    );

                } else {

                    System.err.println("❌ ERROR: No se encontraron datos para el tipoTramite: " + tipoTramite);

                    Assert.fail("No se encontraron datos de liquidación en la base de datos.");
                }

            } catch (SQLException e) {

                System.err.println("❌ ERROR SQL al ejecutar la consulta. Mensaje: " + e.getMessage());
                e.printStackTrace();
                Assert.fail("Fallo SQL: " + e.getMessage());
            }

        } catch (Exception e) {

            System.err.println("❌ ERROR GENERAL en la tarea QueryGetDatosReimpresion.");
            e.printStackTrace();
            Assert.fail("Fallo general: " + e.getMessage());

        } finally {
            System.out.println("----------------------------------------------");
        }
    }

    /**
     * Query robusta para traer un registro válido reciente
     */
    private PreparedStatement createPreparedStatement(Connection con) throws SQLException {

        String fullTableName = base + ".mreg_liquidacion";

        String query = "SELECT numerooperacion, numerorecibo " +
                "FROM " + fullTableName + " " +
                "WHERE tipotramite = ? " +
                "AND fecha > ? " +
                "AND numerooperacion IS NOT NULL AND numerooperacion <> '' " +
                "AND numerorecibo IS NOT NULL AND numerorecibo <> '' " +
                "ORDER BY fecha DESC " +
                "LIMIT 1";

        System.out.println("  > SQL Preparada: " + query);

        PreparedStatement stmt = con.prepareStatement(query);

        stmt.setString(1, tipoTramite);
        stmt.setString(2, "20260101"); // formato correcto YYYYMMDD

        return stmt;
    }

    public static QueryGetDatosReimpresion deCertificadosVirtuales() {
        return new QueryGetDatosReimpresion("certificadosvirtuales", "sii_manizales");
    }
}