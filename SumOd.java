import java.util.*;
class SumOd{
  public static void main(String args[]){
    System.out.println("enter the number");
  int i=1;
    int sum=10;
    do{
      if(i%2==0){
        System.out.println(i);
      }   
      i++;
    }
      while(i<=10);
    sum=sum+i;
    i++;
    System.out.println(sum);
  }
}