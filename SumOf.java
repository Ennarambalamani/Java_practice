import java.util.*;
class SumOf{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int sum=10;
    for(int i=1;i%2==0;i++){
      sum=sum+i;
    }
     System.out.println(sum);
    }
  }
