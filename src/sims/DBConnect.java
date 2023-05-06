/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sims;

/**
 *
 * @author Dell
 */
import java.sql.*;

public class DBConnect {
    Statement statement;
    Connection connection;
    DBConnect(){
     try{  String url = "jdbc:sqlserver://FARHANA\\SQLEXPRESS:1433;databaseName=STUDENT_INTERNSHIP";
            String user = "sa";
            String pass = "4668";
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println(user+" "+url);
            statement = connection.createStatement();
     }  catch(SQLException e){
         e.printStackTrace();
     } 
    }
    Statement getStatement(){
        return statement;
    }
    Connection getConnection(){
        return connection;
    }
    
    
}
