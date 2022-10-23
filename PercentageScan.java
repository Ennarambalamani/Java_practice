import java.util.Scanner;
class PercentageScan{
public static void main(String args[]){
  int tel,hindi,eng,math,sci,soc;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the percentage of tel");
  tel=sc.nextInt();
  System.out.println("enter the percentage of hindi");
  hindi=sc.nextInt();
  System.out.println("enter the percentage of eng");
  eng=sc.nextInt();
  System.out.println("enter the percentage of math");
  math=sc.nextInt();
  System.out.println("enter the percentage of sci");
  sci=sc.nextInt();
  System.out.println("enter the percentage of soc");
  soc=sc.nextInt();
  int total=tel+hindi+eng+math+sci+soc;
  int percentage=(total/600)*100;
  System.out.println("percentage of subjects:"+percentage+"%");
  

  

  }
}