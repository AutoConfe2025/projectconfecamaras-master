package com.co.confecamaras.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.co.confecamaras.models.DataBase.getCon;

public class QueryConfecamarasGestionUsuariosExternos {

    public void buscarData() throws SQLException {
        Connection con = getCon();
        Statement smtDoc= con.createStatement();
        String queryDoc = "DELETE FROM sii_manizales.usuarios_verificados\n" +
                "WHERE email='nicolas.napr@gmail.com' \n" +
                "AND celular='3227816611'\n" +
                "AND identificacion='1024602386'\n" +
                "AND nombre='PICO RODRIGUEZ NICOLAS ANDREY'";
        smtDoc.executeUpdate(queryDoc);

        getCon().close();
    }
}