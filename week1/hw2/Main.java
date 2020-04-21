/***
* CSE292 - Fall 2019

* Main.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String num = JOptionPane.showInputDialog("Enter 5 digit number: ");

        
        String num_str[] = num.split("");

        String result = "";
        for (int i = 0; i < num.length(); i++) {

           
            result = result + num_str[i] + "   ";

        }

        JFrame f = new JFrame();

        JOptionPane.showMessageDialog(f, result);

    }
}

