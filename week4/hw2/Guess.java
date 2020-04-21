/***
* CSE292 - Fall 2019

* Guess.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/

import java.util.Random;
import java.util.Scanner;
public class Guess
{
public static void main(String[] args)
{
int randomvalue;//declare int variable
int Playervalue;
boolean result;
String userchoice;
Random ran = new Random();
Scanner input = new Scanner(System.in); 
do
{
randomvalue = getrandomnumber(ran); 
System.out.println("\n Guess the Number "); 
do
{
Playervalue = getPlayerNumber(input);
result = GuessingGame
(randomvalue,Playervalue);
}while(result != true);
System.out.print(" \n Would you like to play again , Enter Yes if you want. " );//print message to ask the user to play 
userchoice = input.next();
System.out.println();
}while(userchoice.equals("Yes"));
}
public static int getrandomnumber(Random random) 
{
int number;
number = 1 + random.nextInt(1000);
return number;
}

public static int getPlayerNumber(Scanner input) 

{
int number;

System.out.print("\n Guess a number " + "between 1 and 1000: ");
number = input.nextInt();
return number;
}
public static boolean GuessingGame
(int randomnumber,int PlayerNumber)
{
if(PlayerNumber< randomnumber)// if statement
{
System.out.println(PlayerNumber + " is too low. Try again.");// print message when the player guesse low number
return false;
}
else if(PlayerNumber > randomnumber)// else if statement
{
System.out.println(PlayerNumber + " is too high. Try again.");// print message when the player guesse high number
return false;
}
else
{
System.out.println("\n Congratulations. " + "You guessed the number!!");// print message for the correct answer
return true;
}
}
}

