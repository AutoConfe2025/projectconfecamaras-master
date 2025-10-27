package com.co.confecamaras.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.co.confecamaras.models.DataBase.setCon;

public class ConnectSQL {

    Logger logger = Logger.getLogger(ConnectSQL.class.getName());

    public void connectDB(String infoDB, String userDB, String passwordBD ) throws SQLException {
        logger.log(Level.INFO, "Driver loaded");

        Connection con = DriverManager.getConnection("jdbc:mysql://"+ infoDB, userDB, passwordBD);
        setCon(con);

        logger.log(Level.INFO, "Connection created");
    }
}