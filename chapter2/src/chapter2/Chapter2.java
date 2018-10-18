/*In the name of Allah, the Gracious, the Merciful
Trying GUI
*/
package chapter2;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author ibrahim
 */
public class Chapter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(300,300);
        window.setTitle("My GUI App");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton();
        window.add(button);
        button.setSize(10,10);
        button.setVisible(true);
    }
    
}
