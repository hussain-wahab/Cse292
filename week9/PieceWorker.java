/***
* CSE292 - Fall 2019

*PieceWorker.java

* Purpose: Prints a message to the screen.

* @author Hussain Alabdrabalnabi

* @ version 13.0.0

*/
class PieceWorker extends Employee {
//private instance variables wage and pieces
private double wage;
private int pieces;
// constructor
public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wagePerPiece, int numOfPieces)
{
super(firstName, lastName, socialSecurityNumber); // call superclass constructor
setWage(wagePerPiece);
setPieces(numOfPieces);
}
// set wage
public void setWage(double wagePerPiece)
{
wage = wagePerPiece;
}
// set pieces
public void setPieces(int numOfPieces)
{
pieces = numOfPieces;
}
// get wage
public double getWage()
{
return wage;
}
// get pieces
public double getPieces()
{
return pieces;
}
public double earnings()
{
return wage * pieces;
}
public String toString()   
{
return String.format("piece worker: %s%n%s: $%,.2f; %s: $%,.2f",
super.toString(), "number of pieces", getPieces(),   
"wage per piece", getWage());
}
} //end class PieceWorker