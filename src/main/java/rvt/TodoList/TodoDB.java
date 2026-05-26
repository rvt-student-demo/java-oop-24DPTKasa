package rvt.TodoList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TodoDB {
    public static void main(String[] args) {
        try(
            Connection connection = DriverManager.getConnection("jdbc:sqlite:todo.db");
            Statement statement = connection.createStatement();
        ) {
            String sql = "CREATE TABLE IF NOT EXISTS todo" +
            "(id INTEGER PRIMARY KEY, task TEXT NOT NULL) STRICT"; 
            statement.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
