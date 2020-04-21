/***
* CSE292 - Fall 2019

* Value_e.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/

import java.util.Scanner;
public class Value_e
{
public static void main(String[] args)
{
int number;
int factorial;
double result;
Scanner scanner=new Scanner(System.in);
System.out.print("Enter the number of terms: ");
number=scanner.nextInt();
while(number<1)
{
System.out.print("Enter a number greater than 0: ");
number=scanner.nextInt();
} // end while
if(number==1)
System.out.println("The value of e up to the first term is 1");
else
{
result=1.0 ;
factorial=1 ;
for(int term=2 ; term<=number;term++)
{
factorial= factorial *(term-1);
result=result+(1.0/factorial);
}
System.out.printf("The value of e up to the first %d term");
} //end if/else
} // end of main 
} //end of value of e

