//JFM1T3_Assignment4:
/*
1.Write a program to store your best friend's mobile number in a variable and print the last 4 digits. Consider the following sample for reference.
  Mobile number should accept only 10 digits. Not less than 10 digits or greater than 10 digits. 
  Allow user to input the phone number from the terminal

  Sample Input:
        mobileNum=9393927890

  Expected Output:
        Your friend's mobile number ends with ******7890

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class MobileNumber {

//Define the main method
public static void main(String args[]){
  

//Declare the variable
String mobileNum;
//Use the scanner class to provide mobileNum at execution time
Scanner sc=new Scanner(System.in);
//Scanner scanner = new Scanner(System.in);
//System.out.println("Enter phone number (10digit)");
//mobileNum = scanner.nextLine()
  System.out.println("Enter phone number");
mobileNum=sc.next();
Scanner scanner=new Scanner(System.in);
  System.out.println("Enter phone number (10 digits)");
  mobileNum=scanner.nextLine();
//Verify if the mobile number is equal to 10 digits or not
  int a=mobileNum.length();
//If the mobile number is equal to 10 digits then extract the last 4 digits else print error message
if(a==10){
  
//Print the result
//System.out.println("Mobile number ends with ******"+variablename);
System.out.println("Moblie number ends with ******");
  System.out.println("mobile number is valid");
  for(int i=0;i<a;i++){
    if(i<6){
      System.out.println("*");
    }
    else {
         System.out.println(mobileNum.charAt(i));
    }
    }
}
  else{
  System.out.println("Mobile Number is valid");
  }
}
}