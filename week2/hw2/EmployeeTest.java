/***
* CSE292 - Fall 2019

*  EmployeeTest.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/
public class EmployeeTest {
public static void main(String[] args) {
Employee employee1 = new Employee("fn1","ln1",1000);
Employee employee2 = new Employee("fn2","ln2",2000);
employee1.setSalary(employee1.getSalary()*1.10);
System.out.println("Employee1 salary = "+employee1.getSalary());
employee2.setSalary(employee2.getSalary()*1.10);
System.out.println("Employee2 salary = "+employee2.getSalary());
}
}
