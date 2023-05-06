/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class Test {
     public static void main(String[] args) throws SQLException {
      String url = "jdbc:sqlserver://FARHANA\\SQLEXPRESS:1433;databaseName=";
    String dbName="ghorardim";
    String user = "sa";
    String password = "4668";
try {
    Connection connection;
    connection = DriverManager.getConnection(url+dbName,user,password);
    String sql = "INSERT INTO TestTable (ID, NAME, AGE,ADDRESS)" +"VALUES (2, 'Someone', 21, 'Dhaka')"; 

    Statement statement = connection.createStatement();
    int rows =statement.executeUpdate(sql);

    if (rows>0) { 
        JOptionPane.showMessageDialog(null, "Row has beeninserted");
        System.out.println("Row has beeninserted"); }
        connection.close();
    }catch(SQLException e){

    JOptionPane.showMessageDialog(null, "oops you are having a bad day,Connection failed");
    }
     
   }
}
