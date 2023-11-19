package org.HEI_prog3.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private Connection connection;

    public DataBaseConnection(){
        try{
            this.connection = DriverManager.getConnection(
                    Credentials.URL,
                    Credentials.USER,
                    Credentials.PASSWORD
            );
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return this.connection;
    }
}