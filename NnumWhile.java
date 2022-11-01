import java.util.*;
class NnumWhile{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    int a=sc.nextInt();
    int i=1;
    while(i<=10){
      i++;
  System.out.println(a+" * "+i+" = "+a*i);
    }
  }
}