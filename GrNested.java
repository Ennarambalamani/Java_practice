import java.util.*;
class GrNested{
  public static void main(String args[]){
  int num1=10,num2=20,num3=60;
   if(num1>num2){
     if(num1>num3){
     System.out.println("num1 is greater");
     }
     else
     {
     System.out.println("num2 is greater");
     }
   }
   else{
     System.out.println("num3 is greater");
  } 
  }
  }