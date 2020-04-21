/***
* CSE292 - Fall 2019

* Palindrome.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/
import java.util.Scanner;

public class Palindrome {

public static void main(String[] args) {

String ans = "";

do {

System.out.println("Please enter the five digit number");

Scanner sc = new Scanner(System.in);

String input = sc.nextLine();

// Checking for number input

try {

int num = Integer.parseInt(input);

} catch (NumberFormatException ex) {

System.out.println("Please enter number only");

System.exit(0);

}

// Checking the length to 5

if (5 == input.length()) {

String reverse = "";

// Storing the string in reverse order

for (int i = input.length() - 1; i >= 0; i--) {

reverse = reverse + input.charAt(i);

}

if (input.equals(reverse)) {

System.out.println("The string is a palindrome.");

} else {

System.out.println("The string is not a palindrome.");

}

System.out.println("Continue(Y/N)..?");

ans = sc.next();

} else {

System.err.println("Error !! Please enter valid 5 digit number");

System.out.println("Continue(Y/N)..?");

ans = sc.next();

}

} while (ans.equals("y") || ans.equals("Y"));

}

}
