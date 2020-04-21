/***
* CSE292 - Fall 2019

*  Credit.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/
import java.util.Scanner;
public class Credit {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int accountNumber;
int balanceAtBegining;
int totalOfAllItems;
int totalOfAllCredits;
int allowedCrediteds;
int newBalance;
System.out.println("Enter account number");
accountNumber=sc.nextInt();
System.out.println("Enter balance in the begining of the month");balanceAtBegining=sc.nextInt();
System.out.println("Enter total of all items charged by the customer this month");
totalOfAllItems=sc.nextInt();
System.out.println("Enter total of all credits applied to the customer this month");
totalOfAllCredits=sc.nextInt();
newBalance=balanceAtBegining+totalOfAllItems-totalOfAllCredits;
System.out.println("new Balance is "+newBalance);
if(newBalance<totalOfAllCredits)
System.out.println("Credit limit exceeded");
}
}
