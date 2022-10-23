/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

//main method
public static void main(String args[]){
  // Use the scanner class to provide input at execution time using scanner object
Scanner sc=new Scanner(System.in);
  System.out.println("Enter the first number");
  int n1=sc.nextInt();
   System.out.println("Enter the second number");
  int n2=sc.nextInt();
 // Take input from userSystem.out.println("Enter first number: ");
//calculate difference,product,division,increment and remainder 
  int a=n1-n2;
System.out.println("Difference of 2 numbers:"+a);
  System.out.println("Enter the first number:");
  int A1=sc.nextInt();
 System.out.println("Enter the second number:");
  int A2=sc.nextInt();
//calculate the product
  int b=A1*A2;
  System.out.println("Product of 2 numbers:"+b);
System.out.println("Enter the first number:");
  int B1=sc.nextInt();
 System.out.println("Enter the second number:");
  int B2=sc.nextInt();
  //CALACULATE THE DIVISION
  int c=B1/B2;
System.out.println("Division of 2 numbers:"+c );
  System.out.println("Enter the number:");
  int D1=sc.nextInt();
  //calculate the increment and decrement
  D1++;
  D1--;
System.out.println("Increment and Decrement the number:"+D1);
  System.out.println("Enter the first number:");
  int E1=sc.nextInt();
System.out.println("Enter the second number:");
  int E2=sc.nextInt();
  //CALCULATE THE REMANDER
  int f=E1%E2;
System.out.println("Remainder of 2 numbers:"+f);

//print appropriate result for all operations

}
}