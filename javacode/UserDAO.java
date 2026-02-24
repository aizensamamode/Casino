package javacode;

import java.sql.*;

public class UserDAO {

    public static boolean login(String username, String password) {
        try {
            Connection con = DBConnection.getConnection();
            System.out.println("Connected to DB!");

            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username.trim());
            pst.setString(2, password.trim());

            System.out.println("Executing query for: " + username + " / " + password);

            ResultSet rs = pst.executeQuery();
            boolean result = rs.next();
            System.out.println("Login result: " + result);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}