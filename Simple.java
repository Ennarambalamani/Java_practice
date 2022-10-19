class Simple{
public static void main(String args[]){
double principle,rate, time,simple_intrest;
  principle=20000;
  rate=8;
  time=12;
System.out.println("the principle amount"+principle);
System.out.println("the intrest rate"+rate);
System.out.println("the time period"+time);
simple_intrest=principle*(Math.pow((1+rate/100), time))-principle;
System.out.println("\nthe Simple Intrest "+ simple_intrest);
  }
}