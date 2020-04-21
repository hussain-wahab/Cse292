/***
* CSE292 - Fall 2019

*Sales.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version 13.0.0

*/
import java.util.Scanner;

public class Sales
{
  
   public static void main(String[] args)
   {
      Scanner input = new Scanner( System.in );
      
      int total[] = new int[ 9 ]; 
      int sales;
      for ( int i = 0; i < total.length; i++ )
         total[ i ] = 0;
      
      System.out.print( "Enter sales amount (negative to end): " );
     sales = input.nextInt();

      while ( sales >= 0 )
      {
         int salary = 200 + (int) (sales*0.09);
         int count = ( int ) ( salary / 100 );

         if ( count> 10 )
            count = 10;

         ++total[ count - 2 ];
         
         System.out.print( "Enter sales amount (negative to end): " );
         sales = input.nextInt();
      } 
      
     //column headings
   System.out.printf("%-8s%22s\n" , " Range" ,"Number ");  
      for ( int count= 0; count< total.length - 1; count++ )
         System.out.printf( "$%d-$%d\t%d\n",  (200 + 100 * count), (299 + 100 *count), total[ count ] );

      System.out.printf( "$1000 and over\t%d\n",
         total[ total.length - 1 ] );
   } 
} // end class Sales