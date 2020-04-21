/***
* CSE292 - Fall 2019

*DiceRolling.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version 13.0.0

*/
import java.util.Random;

public class DiceRolling
{
   
   public static void main(String[] args)
   {
      Random randomNumbers = new Random();
      //declare variables
      int x; 
      int y; 
      int totals[] = new int[ 13 ]; // frequencies of the sums

      for ( int index = 0; index < totals.length; index++ )
         totals[ index ] = 0;

      for ( int roll = 1; roll <= 1000000; roll++ ) {
       x = 1 + randomNumbers.nextInt( 6 );
        y = 1 + randomNumbers.nextInt( 6 );
         totals[x + y ]++;
      } // end for

      // print the table
      System.out.printf( "%3s%12s%12s\n", "Sum", "Frequency", "Percentage" );
      for ( int i = 2; i < totals.length; i++ )
      {
         int percent = totals[ i ] / ( 10000 );
         System.out.printf( "%3d%12d%12d\n", i , totals[ i ], percent );
      }
   }
} // end class 