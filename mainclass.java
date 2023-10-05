import MCA.*;
import java.util.*;

public class mainclass {
    public static void main(String args[])
   { 
    int rn;
    String name;
    int m1,m2,m3,m4;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter details :");
    name=sc.next();
    rn=sc.nextInt();
    m1=sc.nextInt();
    m2=sc.nextInt();
    m3=sc.nextInt();
    m4=sc.nextInt();
    student obj=new student(rn,name,m1,m2,m3,m4);
    obj.display();
    int total=m1+m2+m3+m4;
float percentage=total/4;
  System.out.println("TOTAL: "+total+ "Percentage="+percentage);
   }
   
}
/*
 * 
 * 
 *    import MCA.*;
import java.util.*;

public class mainclass {
    public static void main(String args[])
   { 
    int rn;
    String name;
    int m1,m2,m3,m4;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter details :");
    name=sc.next();
    rn=sc.nextInt();
    m1=sc.nextInt();
    m2=sc.nextInt();
    m3=sc.nextInt();
    m4=sc.nextInt();
    student obj=new student(rn,name,m1,m2,m3,m4);
    obj.display();
  int total=m1+m2+m3+m4;
float percentage=total/4;
  System.out.println("TOTAL: "+total+ "Percentage="+percentage);
}
}

 */