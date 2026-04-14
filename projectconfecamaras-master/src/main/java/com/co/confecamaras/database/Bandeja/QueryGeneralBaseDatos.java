package com.co.confecamaras.database.Bandeja;

import com.co.confecamaras.tasks.RunDataBase;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.co.confecamaras.models.DataBase.getCon;

@AllArgsConstructor
public class QueryGeneralBaseDatos implements Task {

    private final String CodigoBarrasCapturado;
    private final String estadoFinal;
    private final String base;

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Log 1: Mostrar los parámetros de entrada
        System.out.println("--- Ejecutando Tarea de Actualización de BD ---");
        System.out.println("Parámetros: ");
        System.out.println("  > Base de Datos (Esquema): " + base);
        System.out.println("  > Código de Barras (WHERE): " + CodigoBarrasCapturado);
        System.out.println("  > Estado Final (SET): " + estadoFinal);

        try {
            // 1. Ejecutar la tarea de conexión
            actor.attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));

            // 2. Usar Try-with-resources para asegurar el cierre automático
            try (Connection con = getCon();
                 PreparedStatement stmt = createPreparedStatement(con)) {

                // 3. Establecer los parámetros y ejecutar
                stmt.setString(1, estadoFinal);
                stmt.setString(2, CodigoBarrasCapturado);

                // Log 3: Ejecutando el update
                System.out.println("  > Ejecutando sentencia UPDATE...");

                int filasActualizadas = stmt.executeUpdate();

                // Log 4: Resultado de la ejecución
                System.out.println("✅ Tarea de BD finalizada con éxito.");
                System.out.println("  > Filas actualizadas: " + filasActualizadas);

            } catch (SQLException e) {
                // Log 5: Error de SQL
                System.err.println("❌ ERROR SQL al ejecutar el UPDATE en la BD.");
                System.err.println("   Mensaje de error: " + e.getMessage());
                e.printStackTrace();
            }

        } catch (Exception e) {
            // Log 6: Error general (ej. si falla RunDataBase)
            System.err.println("❌ ERROR GENERAL en la tarea QueryGeneralBaseDatos.");
            e.printStackTrace();
        } finally {
            System.out.println("----------------------------------------------");
        }
    }

    /**
     * Helper para crear el PreparedStatement. Incluye el Log 2.
     */
    private PreparedStatement createPreparedStatement(Connection con) throws SQLException {
        // Aseguramos que el nombre de la tabla esté limpio y sea inyectado solo como nombre de tabla.
        String fullTableName = base + ".mreg_est_codigosbarras";

        String query = "UPDATE " + fullTableName + " " +
                "SET estadofinal = ? " +
                "WHERE codigobarras = ?";

        // Log 2: Mostrar la sentencia SQL que se va a preparar
        System.out.println("  > SQL Preparada: " + query);

        return con.prepareStatement(query);
    }

    // Métodos estáticos de fábrica (sin cambios)
    public static QueryGeneralBaseDatos cambiarEstado(String codigoBarras, String estadoFinal) {
        String basePorDefecto = "sii_manizales";
        return new QueryGeneralBaseDatos(codigoBarras, estadoFinal, basePorDefecto);
    }

    public static QueryGeneralBaseDatos cambiarEstado(String codigoBarras, String estadoFinal, String base) {
        return new QueryGeneralBaseDatos(codigoBarras, estadoFinal, base);
    }
}