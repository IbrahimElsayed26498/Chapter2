/*
In the nmae of allah, the Gracious, the Merciful
This is a program to calculate the product of 3 integers 
*/
package test;
import java.util.Scanner;
//this is a class called Test

/**
 *
 * @author ibrahim
 */
public class Test(){
    
    //this is the main function
    public static void main(String[] args) {
        // variable decleration
        int x, y, z, result;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 1st number : ");
        x = input.nextInt();
        
        System.out.print("Enter 2nd number : ");
        y = input.nextInt();
        
        System.out.print("Enter 3rd number : ");
        z = input.nextInt();
        
        result =x * y * z ; 
        
        System.out.printf("%s%d", "The result is : ", result);
    }
}