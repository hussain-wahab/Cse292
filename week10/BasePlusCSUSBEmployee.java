/***
* CSE292 - Fall 2019

* BasePlusCSUSBEmployee.java

* Purpose: Prints a message to the screen.

* @author Hussain Alabdrabalnabi

* @ version 13.0.0

*/
public class BasePlusCSUSBEmployee extends CSUSBEmployee {
   private double baseSalary; // base salary per week

   // constructor
   public BasePlusCSUSBEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate, double baseSalary) {
      super(firstName, lastName, socialSecurityNumber, 
         grossSales, commissionRate);                      

      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0) {                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }       

      this.baseSalary = baseSalary;
      
   }
   
   // set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }       

      this.baseSalary = baseSalary;                
   } 

   // return base salary
   public double getBaseSalary() {return baseSalary;}

   // calculate earnings
   public double earnings() {return getBaseSalary() + super.earnings();}

   // return String representation of BasePlusCSUSBEmployee
   @Override
   public String toString() {
      return String.format("%s %s: %,.2f",
         super.toString(), "base salary", getBaseSalary());   
   } 
} 
