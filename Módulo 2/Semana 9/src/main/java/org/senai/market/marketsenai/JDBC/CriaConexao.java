package org.senai.market.marketsenai.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriaConexao {

    private static String connectionString = "jdbc:mysql://localhost:3306/SENAI";
    private static String user = "root";
    private static String password = "bacca452";

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(connectionString, user, password);
    }

}