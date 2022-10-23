//nput Format:
//First line of the input is a string that corresponds to a Customer’s name. Assume that the maximum length of the string is 50.

//Output Format:
//Output should display the welcome message along with the Customer’s name.
//Refer sample input and output for formatting specifications.
//[All text in bold corresponds to input and rest corresponds to output.]

//Sample Input and Output:
//Enter your name
//Beena
//Hello Beena ! Welcome to Amphi Event Management System*/
  //package
 import java.util.Scanner;
//main class
class HelloEvent{
  //main method
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your name:");
    String name=sc.next();
    System.out.println("Hello "+name+" !  welcome to Amphi Event Management System");
  }
}
