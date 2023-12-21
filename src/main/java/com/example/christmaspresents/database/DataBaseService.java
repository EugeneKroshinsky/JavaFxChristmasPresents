package com.example.christmaspresents.database;

import com.example.christmaspresents.dto.Request;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseService{

    public Request createRequest() {
        try{
            String url = "jdbc:mysql://localhost/store?serverTimezone=Europe/Moscow&useSSL=false";
            String username = "root";
            String password = "11235813Jeka!";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("asdasd");
            return new Request();
        } catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
        return new Request();
    }
}
