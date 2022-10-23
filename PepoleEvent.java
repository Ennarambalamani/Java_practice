  /*
    Nikhil, the founder of “Pine Tree” company wished to design an Event Management System that would let its Customers plan and host events seamlessly via an online platform.

As a part of this requirement, Nikhil wanted to write a piece of code for his company’s Amphi Event Management System that will display https://github.com/bitLabs-get-jobready/JFM1T2_Assignment-Ennarambalamanicustomized welcome messages by taking Customers’ name as input. Help Nikhil on the task.

Input Format:
First line of the input is a string that corresponds to a Customer’s name. Assume that the maximum length of the string is 50.

Output Format:
Output should display the welcome message along with the Customer’s name.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]

Sample Input and Output:
Enter your name
Beena
Hello Beena ! Welcome to Amphi Event Management System
 
     "Pine Tree" Company has signed up a big time Event Management deal from the Rotary Youth Club for a Trade Fair organized at Codissia Complex, wherein all startup companies in the Software industry are demonstrating their latest products and services and meet with industry partners and Customers.
Amphi Event Management System has to be modified to write a piece of code that will get the input of the number of events to be hosted for the Fair at Codissia from its users and display the same. Help the company to accomplish the requirement.
Input Format:
First line of the input is an integer that corresponds to the number of events to be hosted at Codissia.
Output Format:
Output should display the number of events to be hosted at Codissia.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]
Sample Input and Output:
Enter the number of events hosted in Codissia
50
Number of events hosted in Codissia is 50
    Trade Fairs are important for companies to present their products and to get in touch with its customers and business parties. One such grandeur Trade Fair Event was organized by the Confederation of National Large Scale Industry.
Number of people who attended the event on the first day was x. But as days progressed, the event gained good response and the number of people who attended the event on the second day was twice the number of people who attended on the first day. Unfortunately due to heavy rains on the third day, the number of people who attended the event was exactly half the number of people who attended on the first day.
Given the total number of people who have attended the event in the first 3 days, find the number of people who have attended the event on day 1, day 2 and day 3.
Input Format:
First line of the input is an integer value that corresponds to the total number of people.
Output Format:
First line of the output should display the number of attendees on day 1.
Second line of the output should display the number of attendees on day 2.
Third line of the output should display the number of attendees on day 3.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]
Sample Input and Output:
Enter the total number of people
10500
Number of attendees on day 1 : 3000
Number of attendees on day 2 : 6000
Number of attendees on day 3 : 1500*/
import java.util.Scanner;
class PepoleEvent{
  public static void main(String args[]) {
    Scanner sc=new  Scanner(System.in);
System.out.println("total number of attendies for trade fair");
    int t=sc.nextInt();
    int x=(2*t)/7;
    System.out.println("day 1 attendees" +x);
    System.out.println("day 2 attendees"+2+x);
    System.out.println("day 3 attendees"+x/2);
    
   }
}