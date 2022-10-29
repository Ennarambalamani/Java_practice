/*  JFM1T2_AssignmentPrograms2:

    Write a program to perform the below actions and print the result. Check if the below numbers are equal or not.
    1. 30 and 20
    2. 20 and 20
    3. 20 and 30
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    30
    Enter second number: 
    20
    
    Expected Output:
    30 and 20 is not equal
     
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

 class CheckingEquality {

//main method
public static void main(String args[]){
  

//Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
System.out.println("Enter first number is:" );
   int a=sc.nextInt();
 System.out.println("Enter second number is:");
   int b=sc.nextInt();
//Take input from user
 // System.out.println("Enter first number: ");
if(a=b)
System.out.println("both are not equal");
  else
  System.out.println("Enter first number is:" );
  int c=sc.nextInt();
  System.out.println("Enter second number is:" );
  int d=sc.nextInt()
    if(c=d)
    System.out.println("both are equal");
  else
    System.out.println("both are not equal");
//check if the two numbers are equal or not
System.out.println("Enter first number is:" );
  int e=sc.nextInt();
  System.out.println("Enter second number is:" );
  int f=sc.nextInt()
    if(e=f)
    System.out.println("both are equal");
  else
    System.out.println("both are not equal");
//If the two numbers are equal then pboth are equal else print both are not equal
}
 }