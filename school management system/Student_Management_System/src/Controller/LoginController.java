/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.LoginController.login;
import Model.DBConnection;
import Model.DBSearch;
import View.HomePage;
import View.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class LoginController {
    public static void login(String ID, String pass){
        try{
            String username = null;
            String password = null;
            
            ResultSet rs = new DBSearch().searchLoging(ID);//proceess quary
            while (rs.next()){
                username = rs.getString("username");//assign database login nameto the variable
                password = rs.getString("Password");//assign data base password to te variable
            }
            if (username != null && password != null){
                if (password.equals(pass)){
                    System.out.println("Login Successfull");
                    HomePage view = new HomePage();
                    ///view.bill(username);
                    //view.Latest(username);
                    Login.getFrames()[0].dispose();
                    view.setVisible(true);

                    
                }else {
                    JOptionPane.showMessageDialog(null,"Please check the Credentials","Error", JOptionPane.ERROR_MESSAGE);
                }
                }else {
                    JOptionPane.showMessageDialog(null,"Please check the Credentials","Error", JOptionPane.ERROR_MESSAGE);
                    }
                DBConnection.closeCon();
            } 
        catch(SQLException ex){
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
