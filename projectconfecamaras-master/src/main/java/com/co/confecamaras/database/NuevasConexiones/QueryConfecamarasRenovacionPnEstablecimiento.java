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
                return rs.getString("matricula");
            } else {
                throw new RuntimeException("No se encontró matrícula en la base de datos.");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error consultando la base de datos", e);
        }
    }
}
