import java.util.Scanner;
class SimpleScan{
public static void main(String args[]){
  Scanner y=new Scanner(System.in);
double principle,rate, time,simple_intrest;
System.out.println("the principle amount is");
  principle=y.nextDouble();
System.out.println("the intrest rate is");
  rate=y.nextDouble();
System.out.println("the time period is");
  time=y.nextDouble();
simple_intrest=principle*(Math.pow((principle*rate*time/100), time))-principle;
System.out.println("\nthe Simple Intrest "+ simple_intrest);
  }
}