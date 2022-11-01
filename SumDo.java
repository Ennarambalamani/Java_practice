import java.util.*;
class SumDo{
  public  static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    int i=1;
    int sum=0;
    do{
      System.out.println(i);
    
       sum=sum+i;
      i++;
    }
      while (i<=n);
      System.out.println(sum);
      }
        
      }

