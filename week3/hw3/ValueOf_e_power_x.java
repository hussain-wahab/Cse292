/***
* CSE292 - Fall 2019

*ValueOf_e_power_x.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/
import java.util.Scanner;
public class ValueOf_e_power_x
{
public static void main(String[] args)
{
//variables declartion
int number;
int xValue;
int factorial;
double xPower;
double result;
Scanner scanner= new Scanner(System.in);
System.out.print("Enter the number of terms: ");
number=scanner.nextInt();
while(number<1)
{
System.out.print("Enter a number greater than 0: ");
number= scanner.nextInt();
}

System.out.print("Enter a positive value for x: ");
xValue= scanner.nextInt();
while(xValue<1)
{
System.out.print("Enter a number greater than 0: ");
xValue= scanner.nextInt();
}
if(number==1)
System.out.println("The value of e^" + xValue +" The first term is 1");
else
{
//calculate the value of e^x
result=1.0;
xPower= 1.0;
factorial =1;
for(int term=2;term<= number;term++)
{
//calculate the value of x
xPower=xPower*xValue;
factorial=factorial*(term-1);
result=result+(xPower/factorial);
}
System.out.printf("The value of e^%d up to the first %d term is %.2f" , xValue,number, result);
}
}
}
