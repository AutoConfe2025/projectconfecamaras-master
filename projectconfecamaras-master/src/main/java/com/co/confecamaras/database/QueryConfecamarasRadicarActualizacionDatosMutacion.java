package com.co.confecamaras.database;

import java.sql.*;

import static com.co.confecamaras.models.DataBase.getCon;

public class QueryConfecamarasRadicarActualizacionDatosMutacion {

    public void buscarData() throws SQLException {
        Connection con = getCon();
        Statement smtDoc= con.createStatement();
        String queryDoc = "UPDATE sii_manizales.mreg_est_inscritos\n" +
                "SET dircom='CALLE 40 49 10',telcom2='7894510'\n" +
                "WHERE matricula='204870'";
        smtDoc.executeUpdate(queryDoc);

        getCon().close();
    }
}