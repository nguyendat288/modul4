package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySql {
    public static Connection getConnect() {
        String jdbcURL = "jdbc:mysql://localhost:3306/qlsv";
        String jdbcUsername = "root";
        String jdbcPassword = "Dat12345";
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
