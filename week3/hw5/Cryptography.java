/***
* CSE292 - Fall 2019

* Cryptography.java

* Purpose: Prints a message to the screen.

*

* @author Hussain Alabdrabalnabi

* @ version "1.8.0_222"

*/
public class Cryptography {
  
   public static int encrypt(int input) {
       // input is 4 digit integer
       // convert integer to string
       String str = "" + input;
       // add zeroes at start of number if needed
       int len = str.length();
       for(int i=4;i>len;i--) {
           str = "0" + str;
       }
       // get individual digits
       int first_digit = str.charAt(0) - '0'; // remove '0' to convert char to digit
       int second_digit = str.charAt(1) - '0';
       int third_digit = str.charAt(2) - '0';
       int fourth_digit = str.charAt(3) - '0';
       // add 7 to each digit and take reminder by dividing 10
       first_digit = (first_digit + 7) % 10;
       second_digit = (second_digit + 7) % 10;
       third_digit = (third_digit + 7) % 10;
       fourth_digit = (fourth_digit + 7) % 10;
       // replace first digit with third and second with fourth
       String encrypt_number = "" + third_digit + fourth_digit + first_digit + second_digit;
       // convert string to integer and return it
       return Integer.parseInt(encrypt_number);
   }
  
   public static int decrypt(int input) {
       // input is 4 digit integer
       // convert integer to string
       String str = "" + input;
       // add zeroes at start of number if needed
       int len = str.length();
       for(int i=4;i>len;i--) {
           str = "0" + str;
       }
       // get individual digits
       int first_digit = str.charAt(0) - '0'; // remove '0' to convert char to digit
       int second_digit = str.charAt(1) - '0';
       int third_digit = str.charAt(2) - '0';
       int fourth_digit = str.charAt(3) - '0';
       // add 3 to each digit and take reminder by dividing 10
       first_digit = (first_digit + 3) % 10;
       second_digit = (second_digit + 3) % 10;
       third_digit = (third_digit + 3) % 10;
       fourth_digit = (fourth_digit + 3) % 10;
       // replace first digit with third and second with fourth
       String encrypt_number = "" + third_digit + fourth_digit + first_digit + second_digit;
       // convert string to integer and return it
       return Integer.parseInt(encrypt_number);
   }

}
