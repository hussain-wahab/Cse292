/***
* CSE292 - Fall 2019

*TotalSales.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version 13.0.0

*/
import java.util.Scanner;

//declare class

public class TotalSales
{
    public static void main(String[] args)
   {
      Scanner input = new Scanner( System.in );
//declaration of variable
      double sales[][] = new double[ 5 ][ 4 ];
// print message for Salespersn
      System.out.print( "Enter Salesperson number (-1 to end): " );
      int Salesperson = input.nextInt();

      while ( Salesperson != -1 )
      {
         System.out.print( "Enter product number: " );
         int product = input.nextInt();
         System.out.print( "Enter sales amount: " );
         double amount = input.nextDouble();

         if ( Salesperson >= 1 && Salesperson < 5 &&
               product >= 1 && product < 6 && amount >= 0 )
            sales[ product - 1 ][ Salesperson - 1 ] += amount;
         else
         
         System.out.print( "Enter Salesperson number (-1 to end): " );
         Salesperson = input.nextInt();
      }
      double SalesPersonTotal[] = new double[ 4 ];

      //print the table      
      for ( int col = 0; col  < 4; col ++ )
         SalesPersonTotal[col] = 0;

      System.out.printf( "%8s%16s%16s%16s%16s%12s\n",
            "Product", "Salesperson 1", "Salesperson 2",
            "Salesperson 3", "Salesperson 4", "Total" );

      for ( int row= 0;row< 5; row ++ )
      {
         double productTotal = 0.0;
         System.out.printf( "%8d", (row + 1 ) );

         for ( int col = 0; col  < 4; col ++ ) {
            System.out.printf( "%14.2f", sales[row][ col] );
            productTotal += sales[ row ][ col];
            SalesPersonTotal[ col ] += sales[row][col];
         } 

         System.out.printf( "%20.2f\n", productTotal );
      } 

      System.out.printf( "%8s", "Total" );

      for ( int col = 0; col < 4; col ++ )
         System.out.printf( "%14.2f", SalesPersonTotal[col] );
      
      System.out.println();
   } 
} // end class TotalSales