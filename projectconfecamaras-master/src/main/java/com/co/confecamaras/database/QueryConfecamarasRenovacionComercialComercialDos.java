package com.co.confecamaras.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.co.confecamaras.models.DataBase.getCon;

public class QueryConfecamarasRenovacionComercialComercialDos {

    public void buscarData() throws SQLException {
        Connection con = getCon();
        Statement smtDoc= con.createStatement();
        String queryDoc = "UPDATE sii_manizales.mreg_est_inscritos\n" +
                "SET ciiu2 ='A0111'\n" +
                "WHERE matricula=@matricula";
        smtDoc.executeUpdate(queryDoc);
    }
}