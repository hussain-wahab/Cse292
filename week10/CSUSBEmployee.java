/***
* CSE292 - Fall 2019

* CSUSBEmployee.java

* Purpose: Prints a message to the screen.

* @author Hussain Alabdrabalnabi

* @ version 13.0.0

*/
public class CSUSBEmployee {
   private final String firstName;                        
   private final String lastName;                         
   private final String socialSecurityNumber;             
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage
   
 // five-argument constructor
   public CSUSBEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate) {
      // implicit call to Object constructor occurs here

      // if grossSales is invalid throw exception
      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }      

      // if commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }      

      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   // return first name
   public String getFirstName() {return firstName;}

   // return last name
   public String getLastName() {return lastName;}

   // return social security number 
   public String getSocialSecurityNumber() {return socialSecurityNumber;}

   // set gross sales amount
   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }      

      this.grossSales = grossSales;
   } 

   // return gross sales amount
   public double getGrossSales() {return grossSales;}

   // set commission rate
   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      } 

      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate() {return commissionRate;}

   // calculate earnings
   public double earnings() {
      return getCommissionRate() * getGrossSales();
   } 
   
  // return String representation of CommissionEmployee object 
   public String toString() {
	      return String.format("%s: %-7s %-10s %s: %s %s: %,10.2f %s: %,5.2f", 
	         "Employee", getFirstName(), getLastName(), 
	         "SSN", getSocialSecurityNumber(), 
	         "gross sales", getGrossSales(), 
	         "commission rate", getCommissionRate());
	   } 
} 