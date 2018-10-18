//In the name of Allah, the Gracious, the Merciful
package javaapplication1;
import javax.swing.JOptionPane;
public class JavaApplication1 {

    public static void main(String[] args) {
        String name="";
        if(args.length>0)
            name=args[0];
        else
            name = JOptionPane.showInputDialog("Enter your name : ");
        String email = "Your E-mail is :" + name+ "1223455987@gmail.com";
        JOptionPane.showMessageDialog(null, email);
        
    }
}