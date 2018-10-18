/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttest;

import javax.swing.JOptionPane;

/**
 *
 * @author ibrahim
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your age is : " + number);
        
    }

}
