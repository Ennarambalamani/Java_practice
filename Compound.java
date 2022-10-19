class Compound{
public static void main(String args[]){
 double principle,rate,time,compound_intrest;
  principle=10000;
  rate=12;
  time=24;
System.out.println("the principle amount is"+principle);
System.out.println("the intrest rate is"+rate);
System.out.println("the time period is"+time);
compound_intrest=principle*(Math.pow((1+rate/100), time))-principle;
System.out.println("\nThe Compound Intrest is: "+ compound_intrest);
  }
}