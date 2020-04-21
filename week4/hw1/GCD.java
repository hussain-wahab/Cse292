/***
* CSE292 - Fall 2019

* GCD.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/
import java.util.Scanner;
public class GCD
{
public static void main(String[] args)
{
int num1;
int num2;
Scanner input = new Scanner(System.in);
System.out.print("Enter First number: ");// print message for first number
num1=input.nextInt();
System.out.print("Enter Second number: ");// print message for second number
num2=input.nextInt();
int result=gcd(num1,num2);
System.out.println("GCD Number: "+ result);// print message for the result
}
public static int gcd(int x,int y)
{
int greatest =1;
int smaller=(x<y)? x:y;
for( int i=2; i<=smaller;i++)
if ((x%i==0)&&(y%i==0))
greatest=i;
return greatest;
}
}


