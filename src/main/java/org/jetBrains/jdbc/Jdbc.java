package org.jetBrains.jdbc;

import org.sqlite.SQLiteDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
    //https://www.youtube.com/watch?v=Pni6WxHFTUg&ab_channel=DynamicSoft

    public static void main(String[] args) {
        String url = "jdbc:sqlite:/Applications/DB/";

        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);

        try (Connection con = dataSource.getConnection()) {
            if (con.isValid(5)) {
                System.out.println("Connection is valid.");
            }
            // Statement creation
            try (Statement statement = con.createStatement()) {
                // Statement execution
               /*
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS HOUSES(" +
                        "id INTEGER PRIMARY KEY," +
                        "name TEXT NOT NULL," +
                        "words TEXT NOT NULL)");
                //statement.executeUpdate("CREATE TABLE IF NOT EXISTS HOUSES(id INTEGER PRIMARY KEY, name TEXT NOT NULL, words TEXT NOT NULL)");

                int i = statement.executeUpdate("INSERT INTO HOUSES VALUES " +
                        "(1, 'Targaryen of King''s Landing', 'Fire and Blood')," +
                        "(2, 'Stark of Winterfell', 'Summer is Coming')," +
                        "(3, 'Lannister of Casterly Rock', 'Hear Me Roar!')");

                int u = statement.executeUpdate("UPDATE HOUSES " +
                        "SET words = 'Winter is coming' " +
                        "WHERE id = 2");
                */

                ResultSet rs = statement.executeQuery("Select * from houses");
                while(rs.next()){
                    System.out.println("Retrieving the data...");

                    // Retrieve column values
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String words = rs.getString("words");

                    System.out.printf("\tHouse %d%n", id);
                    System.out.printf("\tName: %s%n", name);
                    System.out.printf("\tWords: %s%n", words);
                }
                System.out.println("Completing the iteration...");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

