/***
* CSE292 - Fall 2019

* multiplication.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/
import java.util.Random;
import java.util.Scanner;
public class multiplication
{
public static void mult()
{
int num1 = 0;
int num2 = 0;
int answer = 0;
Random r = new Random();
Scanner in = new Scanner(System.in);
num1 = r.nextInt(10);
num2 = r.nextInt(10);

System.out.println("How much is " + num1 + " times " + num2 + " = ? ");
answer = in.nextInt();

if (answer == (num1*num2))
{
System.out.println("very good!");
mult();
}
else
{
while (answer != (num1*num2))
{
System.out.println("no.please try again.");
answer = in.nextInt();
}
mult();
}
}
public static void main(String[] args)
{
mult();
}
}
