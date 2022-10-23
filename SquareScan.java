import java.util.Scanner;
class SquareScan{
  public static void main(String args[]){
    int x,y,sum,sum_square;
      Scanner m=new Scanner(System.in);
    System.out.println("enter value of x");
    x=m.nextInt();
System.out.println("enter value of y");
     y=m.nextInt();
    System.out.println("enter value of sum");
    sum=m.nextInt();
    System.out.println("enter value of sum_square");
    sum_square=m.nextInt();
    sum_square=sum*sum;
    System.out.println("the sum of two number is"+sum_square);
  }
}