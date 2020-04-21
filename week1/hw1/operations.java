/***
* CSE292 - Fall 2019

* operations.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/
import java.util.Scanner;

public class operations{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int sum = n1+n2+n3;
        int avg = sum/3;
        int product = n1*n2*n3;
        int min = n1;
        int max = n1;
        if (n2 > max) max = n2;
        if (n3 > max) max = n3;
        if (n2 < min) min = n2;
        if (n3 < min) min = n3;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Product = " + product);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}

