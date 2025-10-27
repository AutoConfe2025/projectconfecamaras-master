package com.co.confecamaras.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.co.confecamaras.models.DataBase.getCon;

public class QueryConfecamarasUsuariosNacionales {
    public void CrearData() throws SQLException {
        Connection con = getCon();
        Statement smtDoc= con.createStatement();
        String queryDoc = "INSERT usuarios_nacionales.usuarios_verificados\n" +
                "SET numid='1026265086',\n" +
                "email='analista@confecamaras.org.co',\n" +
                "tipoverificacion='CS2',\n" +
                "idclase='1',\n" +
                "direccion='CALLE 123',\n" +
                "celular='3165376606',\n" +
                "fechahoraverificacion='20230531 163252',\n" +
                "uuid='805e1477-b2b8-4729-a778-829d3c069813',\n" +
                "nombre1='DANIEL',\n" +
                "estado='VR2',\n" +
                "nombre='RIOS MAYORGA DANIEL FERNANDO',\n" +
                "apellido1='RIOS',\n" +
                "fechahorasolicitud='20230531 163118',\n" +
                "tokensolicitud='7a11f726599fd45b3e1bcae9e43531e4da5224943cbb82ef',\n" +
                "nombre2='FERNANDO',\n" +
                "fechahoraactivacion='20230201 121424',\n" +
                "apellido2='MAYORGA',\n" +
                "claveacceso='$2y$10$4kSgHsy.svbJ4UQdYEgsQ.AD64cxBE0ft029zt5hbTWz44EQ1mpsO',\n" +
                "pais='169',\n" +
                "camaralanzadora='20',\n" +
                "fechaexpedicion='20070712',\n" +
                "municipio='11001'";
        smtDoc.execute(queryDoc);

        getCon().close();
    }
}
