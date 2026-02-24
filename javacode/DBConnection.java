package javacode;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/login_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
            "appuser",   // <-- MySQL username (use 'root' if you prefer)
            "1234"       // <-- MySQL password
        );
    }
}