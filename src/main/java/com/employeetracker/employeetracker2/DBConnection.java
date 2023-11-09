package com.employeetracker.employeetracker2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class DBConnection {
    static Connection conn = null;
    public static Connection createDBConnection(){
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/records.db");
            System.out.println("Successfully connected to dB");
            Statement statement = conn.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 s

            String createquery = "create table if not exists employees(id integer, name varchar(255), age integer, jobTitle varchar(255),salary integer,managerId integer references companies(id))";
            statement.executeUpdate(createquery);

        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
