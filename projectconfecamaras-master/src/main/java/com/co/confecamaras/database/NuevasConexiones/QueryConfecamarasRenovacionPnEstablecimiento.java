package com.co.confecamaras.database.NuevasConexiones;

import com.co.confecamaras.database.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryConfecamarasRenovacionPnEstablecimiento {

    public String buscarMatricula(String query) {

        try (
                Connection con = DataBaseConnection.getConnection();
                PreparedStatement stmt = con.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()
        ) {

            if (rs.next()) {

                // 🔥 SOLUCIÓN CLAVE:
                // Usa índice en vez de nombre de columna (más robusto)
                String matricula = rs.getString(1);

                if (matricula == null || matricula.isEmpty()) {
                    throw new RuntimeException("La matrícula viene null o vacía.");
                }

                return matricula;

            } else {
                throw new RuntimeException("No se encontró matrícula en la base de datos.");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error consultando la base de datos. Query: \n" + query, e);
        }
    }

    public void executeUpdate(String sql) {

        try (
                Connection conn = DataBaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            int rows = stmt.executeUpdate();

            System.out.println("Filas afectadas: " + rows);

            if (rows == 0) {
                throw new RuntimeException("⚠ No se afectó ningún registro");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error ejecutando SQL: \n" + sql, e);
        }
    }
}