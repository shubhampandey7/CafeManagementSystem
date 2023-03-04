/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author bhawana
 */

  //Create a Statement: From the connection interface, you can create the object for this interface.
   //It is generally used for general–purpose access to databases and is useful while using static SQL 
   //statements at runtime.
    //Syntax: Statement statement = connection.createStatement();


public class Dboperation {
    public static void setDataOrDelete(String Query,String msg){
        try{
                Connection con=ConnectionProvider.getcon();
                Statement st=con.createStatement();
                // Step 4: Execute the query
                //executeUpdate() Returns the number of rows affected by the DML statements such as INSERT, DELETE, 
                //and more that is present in the current Prepared Statement.
                st.executeUpdate(Query);
                if(!msg.equals("")){
                    JOptionPane.showMessageDialog(null,msg);
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ResultSet getData(String query){
        try{
            Connection con =ConnectionProvider.getcon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);  
            return rs;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
    
    
}
