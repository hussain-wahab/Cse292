import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /* taking user input using GUI input dialog */
        String num = JOptionPane.showInputDialog("Enter 5 digit number: ");

        /* storing the num string into a string array num_str */
        String num_str[] = num.split("");

        /* taking an empty string for result storing */
        String result = "";
        for (int i = 0; i < num.length(); i++) {

            /* inserting spaces between digits */
            result = result + num_str[i] + "   ";

        }

        /* creating a new frame for output message dialog */
        JFrame f = new JFrame();

        /* displaying the output using GUI dialog */
        JOptionPane.showMessageDialog(f, result);

    }
}

