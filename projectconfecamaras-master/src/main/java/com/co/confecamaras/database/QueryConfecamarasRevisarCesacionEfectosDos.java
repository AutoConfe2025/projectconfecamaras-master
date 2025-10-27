package com.co.confecamaras.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.co.confecamaras.models.DataBase.getCon;

public class QueryConfecamarasRevisarCesacionEfectosDos {

    public void buscarData() throws SQLException {
        Connection con = getCon();
        Statement smtDoc= con.createStatement();
        String queryDoc = "UPDATE sii_manizales.mreg_cortes_renovacion\n" +
                "SET corte='20240331'\n" +
                "WHERE ano='2024'";
        smtDoc.executeUpdate(queryDoc);
        getCon().close();
    }
}