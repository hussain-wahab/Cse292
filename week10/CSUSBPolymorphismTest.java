/***
* CSE292 - Fall 2019

*  CSUSBPolymorphismTest.java

* Purpose: Prints a message to the screen.

* @author Hussain Alabdrabalnabi

* @ version 13.0.0

*/
import java.util.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;

public class CSUSBPolymorphismTest {
   public static void main(String[] args) {
 // test case
  CSUSBEmployee employee1 = new CSUSBEmployee("Sue", "Jones", "111-11-1111", 20000, .06);         
 CSUSBEmployee employee2 = new BasePlusCSUSBEmployee("Bob", "Lewis", "333-33-3333", 8000, .04,  3000); 
 CSUSBEmployee employee3 = new CSUSBEmployee("Micheal", "Hughes", "234-22-2232", 20000, .05);   
 
CSUSBEmployee employee4 = new BasePlusCSUSBEmployee("Sandra", "Stanley", "343-43-3432", 15000, .04, 4000);  

CSUSBEmployee employee5 = new BasePlusCSUSBEmployee("Robert", "Rich", "343-434-222", 23000, .04,4000);  

System.out.println("Test Cases");

System.out.printf("%s %s $%,.2f%n", employee1.toString(), "Earning: ", employee1.earnings());
System.out.printf("%s %s $%,.2f%n", employee2.toString(), "Earning: ", employee2.earnings());
System.out.printf("%s %s $%,.2f%n", employee3.toString(), "Earning: ", employee3.earnings());
System.out.printf("%s %s $%,.2f%n", employee4.toString(), "Earning: ", employee4.earnings());
System.out.printf("%s %s $%,.2f%n", employee5.toString(), "Earning: ", employee5.earnings());
System.out.println();
System.out.println("List of Employees");
System.out.println();
      
 
  
      
	} 
} 