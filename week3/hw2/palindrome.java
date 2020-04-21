/***
* CSE292 - Fall 2019

* Palindrome.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/ 

import java.util.*;

public class palindrome
{
public static void main(String args[]) throws Exception
{
Scanner s = new Scanner(System.in);
System.out.print("Enter a 5-digit integer: ");
String n=s.nextLine();
if(n.length()!=5)
{
System.out.println("Error !! Please enter valid 5 digit number");
return ;
}
for(int i=0;i<2;i++)
if(n.charAt(i)!=n.charAt(4-i))
{
System.out.println("Please enter number only ");
return;
}
System.out.println("Palindrome");

}
}
