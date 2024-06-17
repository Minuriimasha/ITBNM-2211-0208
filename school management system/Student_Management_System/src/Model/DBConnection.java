/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class DBConnection {
    static Connection conn;
    static Statement stat = null;
    
    public static Statement getStatementConnection() {
        try{
            //establish the connection
            String url = "jdbc:mysql://localhost:3306/srtudent_management_system";
            conn = DriverManager.getConnection (url, "root", "");
            //Create the connection
            stat = conn.createStatement();
            
        }
            catch (SQLException e){
            }
        return stat;
        }
        public static void closeCon () throws SQLException { 
            conn.close();
        }
    
        
        public static void main(String[] args) {
        // TODO code application logic here
   }
}
