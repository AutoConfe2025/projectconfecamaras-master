package com.co.confecamaras.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.co.confecamaras.models.DataBase.getCon;

public class QueryConfecamarasDesafiliacionMasiva {

    public void buscarData() throws SQLException {
        Connection con = getCon();
        Statement smtDoc= con.createStatement();
        String queryDoc = "UPDATE mreg_est_inscritos SET ctrafiliacion = '1' \n" +
                "WHERE ctrafiliacion = '2' \n" +
                "AND organizacion = '01' \n" +
                "AND ultanoren = '2023'";
        smtDoc.executeUpdate(queryDoc);
        getCon().close();
    }
}