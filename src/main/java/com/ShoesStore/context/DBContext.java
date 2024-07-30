package com.ShoesStore.context;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {

    public Connection getConnection() throws Exception {
        // For MySQL, the connection URL format is different, and we don't use instance like in SQL Server
        String url = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + dbName + "?useSSL=false";
        // Ensure the MySQL JDBC driver class is loaded
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establish connection to MySQL database
        return DriverManager.getConnection(url, userID, password);
    }

    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "localhost";
    private final String dbName = "trading";
    private final String portNumber = "3306"; // Default MySQL port
    private final String userID = "root"; // Default MySQL user
    private final String password = ""; // Change to your MySQL password
}
