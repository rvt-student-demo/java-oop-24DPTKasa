package rvt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class test {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:data.db");
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("CREATE TABLE todo (id INTEGER, Task STRING");
        } catch (SQLException e) {
            
        }
    }
}
