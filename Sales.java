import java.util.Scanner;

public class Sales
{
   // counts the number of people in given salary ranges
   public static void main(String[] args)
   {
      Scanner input = new Scanner( System.in );
      
      int total[] = new int[ 9 ]; // totals for the various salaries

      // initialize the values in the array to zero
      for ( int counter = 0; counter < total.length; counter++ )
         total[ counter ] = 0;
      
      // read in values and assign them to the appropriate range
      System.out.print( "Enter sales amount (negative to end): " );
      double dollars = input.nextDouble();

      while ( dollars >= 0 )
      {
         double salary = dollars * 0.09 + 200;
         int range = ( int ) ( salary / 100 );

         if ( range > 10 )
            range = 10;

         ++total[ range - 2 ];
         
         System.out.print( "Enter sales amount (negative to end): " );
         dollars = input.nextDouble();
      } // end while
      
      // print chart
      System.out.println( "Range\t\tNumber" );

      for ( int range = 0; range < total.length - 1; range++ )
         System.out.printf( "$%d-$%d\t%d\n",
            (200 + 100 * range), (299 + 100 * range), total[ range ] );

      // special case for the last range
      System.out.printf( "$1000 and over\t%d\n",
         total[ total.length - 1 ] );
   } // end method countRanges
} // end class Sales
