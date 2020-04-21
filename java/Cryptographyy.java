import java.util.Scanner;

public class Cryptographyy {
  
   public static void main(String[] args) {
       // create a scanner object to read from user
       Scanner s = new Scanner(System.in);
       // prompt user for input option
       while(true) {
           // loop till user say exit
           System.out.println("Select Option:");
           System.out.println("1. Encrypt");
           System.out.println("2. Decrypt");
           System.out.println("3. Exit");
           String input = s.nextLine(); // get user input
           int option = 0;
           try {
               // check for valid input
               option = Integer.parseInt(input);
               if(option < 1 || option > 3) {
                   throw new IllegalArgumentException();
               }
           } catch (Exception e) {
               // print error message
               System.out.println("Invalid Input!");
           }
           // check for user option
           if(option == 1) {
               // ask user for data to encrypt
               System.out.print("Enter 4 digit number to Encrypt: ");
               int data = getInput(s); // get user input
               // check for valid input
               if(data == -1) {
                   // print error message
                   System.out.println("Invalid Input!");
               }
               else {
                   System.out.print("Encrypted number is: ");
                   String encrypt_number = "" + Cryptography.encrypt(data);
                   // add zeroes at start of number if needed
                   int len = encrypt_number.length();
                   for(int i=4;i>len;i--) {
                       encrypt_number = "0" + encrypt_number;
                   }
                   System.out.println(encrypt_number);
               }
           }
           else if(option == 2) {
               // ask user for data to decrypt
               System.out.print("Enter 4 digit number to Decrypt: ");
               int data = getInput(s); // get user input
               // check for valid input
               if(data == -1) {
                   // print error message
                   System.out.println("Invalid Input!");
               }
               else {
                   System.out.print("Decrypted number is: ");
                   String decrypt_number = "" + Cryptography.decrypt(data);
                   // add zeroes at start of number if needed
                   int len = decrypt_number.length();
                   for(int i=4;i>len;i--) {
                       decrypt_number = "0" + decrypt_number;
                   }
                   System.out.println(decrypt_number);
               }
           }
           else if(option == 3) {
               // break the loop and exit program
               System.out.println("Bye!");
               break;
           }
       }
      
   }

   private static int getInput(Scanner s) {
       String input;
       // get user input
       input = s.nextLine();
       // check for input length
       if(input.length() != 4) {
           // return as input is not valid
           return -1;
       }
       else {
           // check for integer input
           try {
               int data = Integer.parseInt(input);
               // return the input in integer form
               return data;
           } catch (Exception e) {
               // return as input is not integer type
               return -1;
           }
       }
   }

}


