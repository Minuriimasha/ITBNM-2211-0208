/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class AddRecord {
    Statement stmt;
    
    public void Add(String Student_ID, String Student_Name ,String NIC,String Address,String Phone_Number){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO addstudents VALUES('"+Student_ID+"', '"+Student_Name+"', '"+NIC+"', '"+Address+"', '"+Phone_Number+"')");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    
}
    public static void main(String[] args) {
        // TODO code application logic here
}
    
}
