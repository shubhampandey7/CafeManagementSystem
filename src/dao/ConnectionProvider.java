/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

/**
 *
 * @author bhawana
 */
public class ConnectionProvider {
    public static Connection getcon(){
        try{
            //// Loading driver using forName() method
            Class.forName("com.mysql.cj.jdbc.Driver");
                // Registering driver using DriverManager
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false","root","Shubham7");
                return con; 
        }
        catch(Exception e){
                return null;
                }
    }
}
