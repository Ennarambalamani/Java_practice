//your offer you something based on your final marks

  //90: excellent,i will buy for bike
  ////80:
//very good, I will buy for you mobile
  //70:
//good,cycle
  //60:
//worst,belt

  //father:how much grade you are expecting in final exam
  //son: dad i got 60 per
 // father:Good,I will buy cycle*/
import java.util.*;
class New{
  public static void main(String args){
    Scanner sc=new Scanner(System.in);
  System.out.println("enter sub1 marks");
    int tel=sc.nextInt();
  }
    System.out.println("enter sub2 marks");
    int hin=sc.nextInt();
    System.out.println("enter sub3 marks");
    int eng=sc.nextInt();
    System.out.println("enter sub4 marks");
    int math=sc.nextInt();
    System.out.println("enter sub5 marks");
    int sci=sc.nextInt();
    int total=tel+hin+eng+math+sci;
    int per=(total*100)/500;
    System.out.print("percentage of subjects:"+per+ "%");
    if(per>=90)
    {
       System.out.print("father: how much grade ypur expecting in final exam");
      System.out.println(" son:dad i got" +per+ "%");
       System.out.println(per+ "excellent, bike");
    }
       else if(per>=80)
    {
        System.out.print("father: how much grade your expecting in final exam");
      System.out.println(" son:dad i got" +per+ "%");
       System.out.println(per+"very good, mobile ");
    }
        { if(per>=70){
        System.out.print("father: how much grade your expecting in final exam");
      System.out.println(" son:dad i got"+ per+"%");
       System.out.println(per+"good, cycle ");
          { if(per>60){
            System.out.print("father: how much grade ypur expecting in final exam");
      System.out.println("dad i got 60 per");
       System.out.println(per+"worst,belt ");
    }
    }
      
    
    