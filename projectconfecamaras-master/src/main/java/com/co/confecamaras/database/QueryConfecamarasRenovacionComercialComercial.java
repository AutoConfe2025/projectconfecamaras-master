package com.co.confecamaras.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.co.confecamaras.models.DataBase.getCon;

public class QueryConfecamarasRenovacionComercialComercial {

    public void buscarData() throws SQLException {
        Connection con = getCon();
        Statement smtDoc= con.createStatement();
        String queryDoc = "SET @matricula =(SELECT i.matricula\n" +
                "from sii_manizales.mreg_est_inscritos i\n" +
                "INNER JOIN sii_manizales.mreg_est_propietarios mep ON mep.matriculapropietario = i.matricula\n" +
                "WHERE i.matricula <> ''\n" +
                "AND i.ultanoren = '2024'\n" +
                "AND i.organizacion = '01'\n" +
                "AND i.ctrestmatricula = 'MA'\n" +
                "AND i.actcte < '10000000'\n" +
                "GROUP BY i.matricula\n" +
                "having count(mep.matriculapropietario) = 1\n" +
                "LIMIT 1\n" +
                ")";
        smtDoc.executeUpdate(queryDoc);
    }
}