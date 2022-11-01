import java.util.*;
class SumEdo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    int i=sc.nextInt();
    int sum=10;
    do{
    if(i%2==0){
      System.out.println(i);
    }
      sum=sum+i;
      i++;
    }while(i<=10);
      System.out.println(sum);
    }
    
  }
