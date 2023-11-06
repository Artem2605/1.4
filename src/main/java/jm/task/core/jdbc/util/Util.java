package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/dbforkata";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static Connection connection = null;

    public Connection getConnection() {
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
