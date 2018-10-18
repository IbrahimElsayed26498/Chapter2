/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_one;

import javax.swing.JOptionPane;

/**
 *
 * @author ibrahim
 */
public class NewClass {
    public static void main(String[] args) {
        String courseName = JOptionPane.showInputDialog(null,"Enter course name : ");
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
}
