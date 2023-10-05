import java.util.*;
class Teacher{

  int Tid;
  String des,Tname,subject;
  float salary;
  void display()
  {
    System.out.println("ID ::"+this.Tid+"\n NAME: "+this.Tname+"\n Designation :"+this.des+"\n Subject :"+this.subject+"\n Salary :"+this.salary);
  }
}
public class Teacher_main{

public static void main(String args[])
   {
    int n;
    System.out.println(" how many teachers you want ::");
    Scanner sc=new  Scanner(System.in);
    n=sc.nextInt();
    Teacher []T=new Teacher[n];
    System.out.println("enter details :");
    for(int i=0;i<n;i++){
         T[i]=new Teacher();
        System.out.println("enter Id , name , dEsignation ,Subject ,SAlary ");
        T[i].Tid=sc.nextInt();
        T[i].Tname=sc.next();
        T[i].des=sc.next();

        T[i].subject=sc.next();
        T[i].salary=sc.nextFloat();
    } 
    for(int i=0;i<n;i++)
    {
        if(T[i].subject.equals("java")||T[i].subject.equals("Java")||T[i].subject.equals("JAVA"))
          T[i].display();
    }
  }
}