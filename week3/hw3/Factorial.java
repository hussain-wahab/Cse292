/***
* CSE292 - Fall 2019

* Factorial.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/

import java.util.Scanner;
public class Factorial
{
   public static void main(String[] args)
   {
       Scanner scan=new Scanner(System.in);
       int num;
      
       do
       {
           System.out.println("Enter a non-negative integer value :");
           num=scan.nextInt();
          
           if(num<0)
               System.out.println("Invalid number.Enter valid number.");
          
       }while(num<0);
      
       //Set factorial ;
       int factorial=1;      
       for (int i = num; i >=1; i--)
       {
           //multiply factorial 
           factorial=factorial*i;
       }
      
       System.out.printf("Factorial of %d is %d. ",num,factorial);
   }
}
