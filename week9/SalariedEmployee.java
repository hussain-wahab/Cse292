/***
* CSE292 - Fall 2019

*SalariedEmployee.java

* Purpose: Prints a message to the screen.

* @author Hussain Alabdrabalnabi

* @ version 13.0.0
*/
public class SalariedEmployee extends Employee{
private double weeklySalary;
// constructor
public SalariedEmployee(String firstName, String lastName,
String socialSecurityNumber, double weeklySalary)
{
super(firstName, lastName, socialSecurityNumber);
if (weeklySalary < 0.0)
throw new IllegalArgumentException(
"Weekly salary must be >= 0.0");
this.weeklySalary = weeklySalary;
}
// set salary
public void setWeeklySalary(double weeklySalary)
{
if (weeklySalary < 0.0)
throw new IllegalArgumentException(
"Weekly salary must be >= 0.0");
this.weeklySalary = weeklySalary;
}
// return salary
public double getWeeklySalary()
{
return weeklySalary;
}
public double earnings()
{   
return getWeeklySalary();
}   
public String toString()   
{
return String.format("salaried employee: %s%n%s: $%,.2f",
super.toString(), "weekly salary", getWeeklySalary());
}
} // end class SalariedEmployee