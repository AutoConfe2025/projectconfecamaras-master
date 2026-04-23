package com.co.confecamaras.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private static final String URL = System.getenv("DB_URL") != null
            ? System.getenv("DB_URL")
            : System.getProperty("DB_URL");

    private static final String USER = System.getenv("DB_USER") != null
            ? System.getenv("DB_USER")
            : System.getProperty("DB_USER");

    private static final String PASSWORD = System.getenv("DB_PASSWORD") != null
            ? System.getenv("DB_PASSWORD")
            : System.getProperty("DB_PASSWORD");

    private DataBaseConnection() {
        // Evita instanciación
    }

    public static Connection getConnection() {

        if (URL == null || USER == null || PASSWORD == null) {
            throw new RuntimeException("Las variables de entorno de BD no están configuradas.");
        }

        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Error conectando a la base de datos", e);
        }
    }
}
