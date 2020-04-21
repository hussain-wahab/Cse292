/***
* CSE292 - Fall 2019

* main.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/


import java.util.*;
public class main
	{
   public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
       System.out.print("Enter a five-digit Integer: ");
       int x=sc.nextInt();
       if(x%5==0)
       System.out.println("number "+x+" is divisible by "+5);
       else
       System.out.println("number "+x+" is not divisible by "+5);
      
           System.out.println("The number is: "+" "+x);
   System.out.println("The number is: "+"00000"+x);
   String s= Integer.toString(x);
   String st="";
   for(int i=0;i<s.length();i++)
   {
   if(i==1)
   st=st+s.charAt(i)+',';
   else
   st=st+s.charAt(i);
   }
   System.out.println("The number is: "+st);
   System.out.println("The number is: $"+st);

   }
}


