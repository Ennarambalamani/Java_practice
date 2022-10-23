import java.util.Scanner;
class QuadraticScan{
public static void main( String args[]){
   double a,b,c;
  Scanner x=new Scanner(System.in);
  System.out.println("enter the value of a");
  a=x.nextDouble();
  System.out.println("enter the value of b");
  b=x.nextDouble();
  System.out.println("enter the value of c");
  c=x.nextDouble();
double result=(b*b)-4*a*c;
  System.out.println(result);
  }
}