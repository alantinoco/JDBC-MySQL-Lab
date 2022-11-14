package org.example;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException classError){
            System.out.println("Error :" + classError);
        }

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://172.17.0.2:3306/TheDoctorDB", "root", "password");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM actors;");
            while(resultSet.next()){
                System.out.println(resultSet.getString("firstName")+ " " + resultSet.getString("lastName"));
            }
            connection.close();
        }catch(SQLException sqlError){
            System.out.println("Error :" + sqlError);
        }
    }

}