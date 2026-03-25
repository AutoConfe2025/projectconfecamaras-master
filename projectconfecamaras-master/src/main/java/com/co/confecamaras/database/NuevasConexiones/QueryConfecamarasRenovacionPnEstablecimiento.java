package com.co.confecamaras.database.NuevasConexiones;

import com.co.confecamaras.database.DataBaseConnection;

import java.sql.*;

import static org.testcontainers.shaded.org.bouncycastle.cms.RecipientId.password;

public class QueryConfecamarasRenovacionPnEstablecimiento {

    public String buscarMatricula(String query) {

        try (
                Connection con = DataBaseConnection.getConnection();
                PreparedStatement stmt = con.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()
        ) {

            if (rs.next()) {
                return rs.getString("matricula");
            } else {
                throw new RuntimeException("No se encontró matrícula en la base de datos.");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error consultando la base de datos", e);
        }
    }

    public void executeUpdate(String sql) {

        try (Connection conn = DataBaseConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            int rows = stmt.executeUpdate(sql);

            System.out.println("Filas actualizadas: " + rows);

            if (rows == 0) {
                throw new RuntimeException("⚠ No se actualizó ningún registro");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error ejecutando UPDATE", e);
        }
    }
}
