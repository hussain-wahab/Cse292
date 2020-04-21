import java.util.Scanner;

public class operations{

public static void main (string[]args) {

int number1;
int number2;
int number3;
int sum,avg,prod,small,large;

Scanner input= new Scanner(System.in);

System.out.print("Enter first integer : ");
number1=input.nextInt();

System.out.print("Enter second integer : ");
number2=input.nextInt();

System.out.print("Enter third integer : ");
number3=input.nextInt();

sum= number1+number2+number3;
avg=(number1+number2+number3)/3;
prod=number1*number2*number3;

if(number1>number2) {
if(number1>number3)
large=number1;
else
large=number3;
}
else {
if(number2>number3)
large=number2;
else
large=number3;
}

if(number1<number2) {
if(number1<number3)
small=number1;
else
small=number3;
}
else {
if(number2<number3)
small=number2;
else
small=number3;
}


}
System.out.printf("The three number of sum=%d",sum);
System.out.printf("\n The three numbers of average=%d",avg);
System.out.printf("\n The three numbers of product=%d",pord);
System.out.printf("\n Largest of three number is=%d",large);
System.out.printf("\n Smallest of three number is=%d",small);
System.exit(0)
}

}


