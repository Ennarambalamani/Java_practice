import java.util.*;
class NnumDo{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int i=1;
    do{
      i++;
    } while(i<=10);
    System.out.println(num+" * "+i+" = "+num*i);
  }
}