/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class UserController {
    public static void Add(String Student_ID, String Student_Name ,String NIC,String Address,String Phone_Number) {
        
            new Model.AddRecord().Add(Student_ID,Student_Name, NIC, Address, Phone_Number);
            JOptionPane.showMessageDialog(null, "New Product has been inserted", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
