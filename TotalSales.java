import java.util.Scanner;

public class TotalSales
{
    public static void main(String[] args)
   {
      Scanner input = new Scanner( System.in );
      double sales[][] = new double[ 5 ][ 4 ];

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
            System.out.println( "Invalid input!" );
         
         System.out.print( "Enter Salesperson number (-1 to end): " );
         Salesperson = input.nextInt();
      }
      double SalesPersonTotal[] = new double[ 4 ];

      //print the table      
      for ( int column = 0; column < 4; column++ )
         SalesPersonTotal[ column ] = 0;

      System.out.printf( "%8s%14s%14s%14s%14s%8s\n",
            "Product", "Salesperson 1", "Salesperson 2",
            "Salesperson 3", "Salesperson 4", "Total" );

      for ( int row = 0; row < 5; row++ )
      {
         double productTotal = 0.0;
         System.out.printf( "%8d", ( row + 1 ) );

         for ( int column = 0; column < 4; column++ ) {
            System.out.printf( "%14.2f", sales[ row ][ column ] );
            productTotal += sales[ row ][ column ];
            SalesPersonTotal[ column ] += sales[ row ][ column ];
         } 

         System.out.printf( "%8.2f\n", productTotal );
      }

      System.out.printf( "%8s", "Total" );

      for ( int column = 0; column < 4; column++ )
         System.out.printf( "%14.2f", SalesPersonTotal[ column ] );
      
      System.out.println();
   } 
} 