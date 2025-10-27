package com.co.confecamaras.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.co.confecamaras.models.DataBase.getCon;

public class QueryCortesRenovacion {

    public void buscarData() throws SQLException {
        Connection con = getCon();
        Statement smtDoc= con.createStatement();
        String queryDoc = "UPDATE sii_manizales.mreg_cortes_renovacion\n" +
                "SET corte='20250431'\n" +
                "WHERE ano='2025'";
        smtDoc.executeUpdate(queryDoc);
        getCon().close();
    }
}
