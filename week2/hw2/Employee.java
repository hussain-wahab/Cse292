/***
* CSE292 - Fall 2019

* Employee.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/
public class Employee {
private String firstName;
private String lastName;
private double salary;
public Employee() {
}
public Employee(String firstName, String lastName, double salary) {
setFirstName(firstName);
setLastName(lastName);
setSalary(salary);
}
public String getFirstName() {
return firstName;
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public String getLastName() {
return lastName;
}
public void setLastName(String lastName) {
this.lastName = lastName;
}
public double getSalary() {return salary;
}
public void setSalary(double salary) {
if(salary<0){
this.salary = 0;
}
else {
this.salary = salary;
}
}
}
