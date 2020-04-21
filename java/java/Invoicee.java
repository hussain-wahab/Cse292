import java.util.*;
public class Invoice {
String number;
String description;
int quantity;
double price;
public Invoice() {
/* YOUR CONSTRUCTOR CODE HERE */ }
public String getNumber()
{
Scanner s1 = new Scanner(System.in);
System.out.println("enter Partnumber");
number = s1.nextLine();
return number;
}
public String getDescription() {
Scanner s1 = new Scanner(System.in);
System.out.println("Enter description");
description = s1.nextLine();
return description;
}
public int getQuantity() {
Scanner s1 = new Scanner(System.in);
System.out.println("Enter quantity");
quantity = s1.nextInt();
return quantity;
}
public double getPrice() {
Scanner s1 = new Scanner(System.in);
System.out.println("Enter price");
price = s1.nextDouble();return price;
}
public double getInvoiceAmount() {
double InvoiceAmount =0.0;
InvoiceAmount = price * quantity;
return InvoiceAmount;
}
public static void main(String[] args) {
double result =0.0;
Invoice h1 = new Invoice();
h1.getNumber();
h1.getDescription();
h1.getQuantity();
h1.getPrice();
result = h1.getInvoiceAmount();
System.out.println("invoice amount " + result)

