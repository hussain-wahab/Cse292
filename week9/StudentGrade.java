/***
* CSE292 - Fall 2019

*StudentGrade.java

* Purpose: Prints a message to the screen.

* @author Hussain Alabdrabalnabi

* @ version 13.0.0

*/
import java.io.*;
import java.util.Scanner;
public class StudentGrade
{
   public static void main(String[] args) throws Exception
   {
      
       int i=0,exit=0,count=0;
       float sum=0;
       Scanner s1 = new Scanner(System.in);
       Scanner s2 = new Scanner(System.in);
       Scanner s3 = new Scanner(System.in);
       float arr1[] = new float[50];
       String arr2[] = new String[50];
       System.out.println("Enter the details....");
       try{
       do
       {
       System.out.println("Enter the name:");
       arr2[i]=s1.nextLine();
       System.out.println("Enter the GPA:");
       arr1[i]=s2.nextFloat();
       System.out.print("Enter -1 to exit 0 to continue!:");
       exit=s3.nextInt();
       i++;
       count++;
       }while(exit!=-1);
      
       for(i=0;i<count;i++)
       {
       sum=sum+arr1[i];
       }
       float avg=sum/count;
       System.out.println("The average grade point average of the class is : " + avg);
       System.out.println("Enter the index between 0 to "+(count-1)+":");
       int index=s3.nextInt();
       System.out.println("The Grade point average of "+arr2[index]+"is "+arr1[index]);
       }
       catch(Exception e)
       {
       System.out.println("The Error is:"+e);
       }
   }
}