import java.util.Scanner;
class CompoundScan{
public static void main(String args[]){
 double principle,rate,time,compound_intrest;
  Scanner sc=new Scanner(System.in);
System.out.println("the principle amount is :");
  principle=sc.nextDouble();
System.out.println("the intrest rate is :");
  rate=sc.nextDouble();
System.out.println("the time period is:");
  time=sc.nextDouble();
compound_intrest=principle*(Math.pow((1+rate/100), time))-principle;
System.out.println("\nThe Compound Intrest is: "+ compound_intrest);
  }
}