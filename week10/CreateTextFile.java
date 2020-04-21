/***
* CSE292 - Fall 2019

* CreateTextFile.java

* Purpose: Prints a message to the screen.

* @author Hussain Alabdrabalnabi

* @ version 13.0.0

*/
import java.io.FileNotFoundException;     
import java.lang.SecurityException;       
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;  
import java.util.Scanner;                 

public class CreateTextFile {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
// print message that tell enter your info
 System.out.printf("%s%n%s%n? ", 
  "Enter account number, first name, last name and balance.",
  "Enter end-of-file indicator to end input.");
      // open clients.txt, output data to the file then close clients.txt
      try (Formatter output = new Formatter("clients.txt")) {
         while (input.hasNext()) { // loop until end-of-file indicator
            try {
 // output new record to file; assumes valid input
 output.format("%d %s %s %.2f%n", input.nextInt(),  
input.next(), input.next(), input.nextDouble());
  } 
 catch (NoSuchElementException elementException) {
// discard input so user can try again               
System.err.println("Invalid input. Please try again.");
               input.nextLine(); 
            } 

            System.out.print("? ");
         }
      }
      catch (SecurityException | FileNotFoundException | 
         FormatterClosedException e) {
         e.printStackTrace();
         System.exit(1); // terminate the program
      } 
   } 
}
