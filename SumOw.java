import java.util.*;
class SumOw{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int i=sc.nextInt();
    int sum=10;
    while(i%2==0){
      sum=sum+i;
      i++;
      System.out.println(sum);
    }
    
  }
}