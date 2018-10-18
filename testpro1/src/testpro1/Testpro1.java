//In the name of Allah, the Gracious, the Merciful
/* the first and second assignment.
    Write a program that calculates the multiplication of two numbers
    entered by the user.
    Write a program that enables user to enter two numbers in input
    dialog and the program should display the addition of these
    numbers in a message dialog.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpro1;
import javax.swing.JOptionPane;

/**
 *
 * @author ibrahim
 */
public class Testpro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Num1 , Num2 ;//the two variables which will catch the inputs
        
        //for comand line arfuments
        
        if(args.length > 0){//if there are arguments
            Num1 = Integer.parseInt(args[0]);//put first argument in Num1 variable
            Num2 = Integer.parseInt(args[1]);//put second argument in Num1 variable
            
            //the out put will be in DOS
            System.out.println("\nNum1 + Num2 = "+ (Num1+Num2));
            System.out.println("Num1 - Num2 = "+ (Num1-Num2));
            System.out.println("Num1 * Num2 = "+ (Num1*Num2));
            
            //check if the Multiplication could happend
            if (Num2 != 0)//if yes
                System.out.printf("Num1 / Num2 = %d", (Num1/Num2));//end if statement
            else//if no
                System.out.println("You can't Multiply by 0 ");//end else stmt
            
            System.out.println("\n");//new line
        }//endif stmt
        //if there aren't arguments
        else{
            //use GUI for input
            
            Num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the First Number"));
            Num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second Number")) ;
            
            //use GUI for output
            JOptionPane.showMessageDialog(null, "Num1 + Num2 = "+ (Num1+Num2));
            JOptionPane.showMessageDialog(null, "Num1 - Num2 = "+ (Num1-Num2));
            JOptionPane.showMessageDialog(null, "Num1 * Num2 = "+ (Num1*Num2));
            
            //check if the Multiplication opreator could happend
            
            if(Num2 == 0){//if yes
                JOptionPane.showMessageDialog(null, "You can not Multiply by Zero", "Warning",
                JOptionPane.WARNING_MESSAGE);
            }//end if stmt
            
            else{//if no.
                JOptionPane.showMessageDialog( null,"Num1 / Num2 = "+(Num1/Num2));
            }//end else stmt
           
        }//end else stmt
        
        
    }
    
}
