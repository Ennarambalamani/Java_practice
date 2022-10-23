import java.util.Scanner;
class SalaryEvent{
  public static void main(String args[]){
    Scanner b=new Scanner(System.in);
    System.out.println("enter the total salary");
    int a=b.nextInt();
    int x=(a-800)/130;
    System.out.println("weekends hours"+x);
      System.out.println("weekdays hours" +(10+x));
  }
}