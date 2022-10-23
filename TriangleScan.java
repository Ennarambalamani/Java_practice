import java.util.Scanner;
class TriangleScan{
  public static void main(String args[]){
    double b,h,area;
    Scanner a=new Scanner(System.in);
    System.out.println("enter a value of b");
      b=a.nextDouble();
    System.out.println("enter a value of h");
      h=a.nextDouble();
    area=(b*h)/2;
System.out.println("area of triangle" +area);
  }
}