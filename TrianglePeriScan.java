import java.util.Scanner;
class TrianglePeriScan{
public static void main(String args[]){
  double a,b,c,peri;
  Scanner d=new Scanner(System.in);
  System.out.println("enter value of a");
  a=d.nextDouble();
System.out.println("enter value of b");
  b=d.nextDouble();
System.out.println("enter value of c");
  c=d.nextDouble();
  peri=(a+b+c)/2;
System.out.println("peri of triangle" +peri);
}
}