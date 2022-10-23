import java.util.Scanner;
class SalaryScan{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the basic");
    int basic=sc.nextInt();
       System.out.println("hra");
    int hra=(12*basic)/100;
   System.out.println("da");
    int da=(20*basic)/100;
    int gs= basic+hra+da;
  System.out.println("gross salary,"+gs) ;
                    
  }
}