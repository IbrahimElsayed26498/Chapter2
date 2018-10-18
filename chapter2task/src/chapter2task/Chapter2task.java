/*
2.33
 */
package chapter2task;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.util.Scanner;



/**
 *
 * @author ibrahim
 */
public class Chapter2task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int BIM, weightInKg, hightInMeters;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the weight (in Kg) : ");
        weightInKg = input.nextInt();
        System.out.print("Enter the hight  (in Km) : ");
        hightInMeters = input.nextInt();
        
        BIM = weightInKg / (hightInMeters*hightInMeters);
        
        System.out.println("Your BIM values is : " + BIM);
        System.out.print("BMI VALUES\n" +
                         "Underweight:" + "less than 18.5\n" +
                         "Normal:     " + "between 18.5 and 24.9\n" +
                         "Overweight: " +"between 25 and 29.9\n"+
                         "Obese:      " +"30 or greater\n");
    }
   
}
