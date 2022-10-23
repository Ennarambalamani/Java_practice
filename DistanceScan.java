import java.util.Scanner;
class DistanceScan{
public static void main(String args[])
  {
  double dis, a,b,c,d;
    Scanner sc=new Scanner(System.in);
  System.out.println("enter a value of a ");
    a=sc.nextDouble();
System.out.println("enter a value of b");
    b=sc.nextDouble();
  
  System.out.println("enter a value of c");
     c=sc.nextDouble();
System.out.println("enter a value of d");
    d=sc.nextDouble();
    dis=Math.sqrt((b-a)*(b-a)+(d-c)*(d-c));
System.out.println("distancebetween "+"("+a+","+c+"),"+"("+b+","+d+")"+dis);
  }
  }