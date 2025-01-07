/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.toysmanagement.view;

/**
 *
 * @LMUID 23048624
 * @author amritbhattarai
 */
public class ToysManagementMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPageMain().setVisible(true);
            }
        });
        
    }
    
}
