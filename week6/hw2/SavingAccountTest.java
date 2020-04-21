/***
* CSE292 - Fall 2019

*SavingAccountTest.java

* Purpose: Prints a message to the screen.

* @author Hussain Alabdrabalnabi

* @ version 13.0.0

*/
public class SavingAccountTest
{
 public static void main( String args[] )
 {
  SavingAccount saver1  = new SavingAccount( 2000 );
  SavingAccount saver2  = new SavingAccount( 3000 );
 SavingAccount.modifyInterestRate( 0.04 );
//Print message to show the balances for one year
 System.out.println( "Monthly balances for one year at .04" );
 System.out.println( "Balances:" );
//Print message to show the Saver1 and Saver2
 System.out.printf( "%20s%10s\n", "Saver 1", "Saver 2" );
//Print message to show the Base month 1 to 12
 System.out.printf( "%-10s%10s%10s\n", "Base",
 saver1.toString(), saver2.toString() );
/*
for loops to show the months 1 to 12 
m represent month
*/
 for ( int m = 1; m <= 12; m++ )
 {
 String month = String.format( "Month %d:", m );
 saver1.calculateMonthlyInterest();
 saver2.calculateMonthlyInterest();
 System.out.printf( "%-10s%10s%10s\n", month,
 saver1.toString(), saver2.toString() );
} // end for
 SavingAccount.modifyInterestRate( .05 );
saver1.calculateMonthlyInterest();
saver2.calculateMonthlyInterest();
//Print message for Interest Rate .05
System.out.println( "\nAfter setting interest rate to .05 and calculating monthly interest " );
System.out.println( "Balances:" );
 System.out.printf( "%-10s%10s\n", "Saver 1", "Saver 2" );
 System.out.printf( "%-10s%10s\n", saver1.toString(), saver2.toString() );
 } 
 } // end class SavingAccountTest