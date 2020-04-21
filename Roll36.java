import java.util.Random;

public class Roll36
{
   // simulate rolling of dice 36000 times
   public static void main(String[] args)
   {
      Random randomNumbers = new Random();
      
      int face1; // number on first die
      int face2; // number on second die
      int totals[] = new int[ 13 ]; // frequencies of the sums

      // initialize totals to zero
      for ( int index = 0; index < totals.length; index++ )
         totals[ index ] = 0;

      // roll the dice
      for ( int roll = 1; roll <= 36000; roll++ ) {
         face1 = 1 + randomNumbers.nextInt( 6 );
         face2 = 1 + randomNumbers.nextInt( 6 );
         totals[ face1 + face2 ]++;
      } // end for

      // print the table
      System.out.printf( "%3s%12s%12s\n",
         "Sum", "Frequency", "Percentage" );

      // ignore subscripts 0 and 1
      for ( int k = 2; k < totals.length; k++ )
      {
         int percent = totals[ k ] / ( 360 );
         System.out.printf( "%3d%12d%12d\n", k, totals[ k ], percent );
      } // end for
   } // end method rollDice
} // end class Roll36