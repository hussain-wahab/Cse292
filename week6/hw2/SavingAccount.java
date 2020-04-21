/***
* CSE292 - Fall 2019

*SavingAccount.java

* Purpose: Prints a message to the screen.

* @author Hussain Alabdrabalnabi

* @ version 13.0.0

*/
public class SavingAccount{
// interest rate for all accounts
 private static double AnnualInterestRate = 0;
// balance for currrent account
private double SavingsBalance; 
public SavingAccount( double balance )
 {
SavingsBalance = balance;
}
 public void calculateMonthlyInterest()
 {
 SavingsBalance += SavingsBalance * ( AnnualInterestRate / 12.0 );
 } 
 public static void modifyInterestRate( double Rate )
 {
 AnnualInterestRate = ( Rate >= 0 && Rate <= 1.0 ) ? Rate : 0.04;
 } 
 public String toString()
 {
 return String.format( "$%.2f", SavingsBalance );
 } 
 } // end class SavingAccount