import java.util.*;
 class Student{
    int math,english,geography,science,marathi,total;
    float percent;
    String grade;

    Student(int m,int e,int g,int s, int mar){ // parameterized contstructor 
        this.marathi=mar;
        this.english=e;
        this.math=m;
        this.geography=g;
        this.science =s ;
    }
    void calculate(){

        this.total=marathi+english+math+geography+science;
        this.percent=this.total/5;
        if(percent>0&&percent<=20)
            grade="E2";
        else if(percent>20&&percent<=30)
            grade="E1";
        else if(percent>30&&percent<=40)
            grade="D";
        else if(percent>40&&percent<=50)
            grade="C2";
        else if(percent>50&&percent<=60)
            grade="C1";
        else if(percent>60&&percent<=70)
            grade="B2";
        else if(percent>70&&percent<=80)
            grade="B1";
        else if(percent>80&&percent<=90)
            grade="A2";
        else if(percent>90&&percent<=100)
            grade="A1";              
            
    }
void display()
{
    System.out.println("************************************************");
System.out.println("Total Marks ::   "+total);
System.out.println("Average percentage ::   "+percent+"%");
System.out.println("Grade ::   "+grade);  
    System.out.println("************************************************");
}
    
    
}
public class task2{
public static void main(String args[])
{
    int m,mar,e,g,s;
    Scanner sc=new Scanner(System.in);
    int nn,i;
    System.out.println((" how many students are inthe class ::"));
    nn=sc.nextInt();
    Student obj1[]=new Student[nn];
    for(i=0;i<nn;i++)
    {   
        System.out.print("\033c");
        System.out.println("          enter marks  for student number::"+(i+1));
        System.out.print("          enter marks of English :");
        e=sc.nextInt();
        while(e>100||e<0)
        {
          System.out.print("\033c");  // ANSI code to clear terminal screen 
          System.out.println("wrong input ");
            System.out.print("enter marks of English :");
            e=sc.nextInt();
        }   
        System.out.print("\033c");
        System.out.print("enter marks of Marathi :");
        mar=sc.nextInt();
        while(mar>100||mar<0)
        {
            System.out.print("\033c");
          System.out.println("wrong input ");
            System.out.print("enter marks of Marathi :");
            mar=sc.nextInt();
        }   
        System.out.print("\033c");
        System.out.print("enter marks of maths :");
        m=sc.nextInt();
       while(m>100||m<0)
        {
            System.out.print("\033c");
          System.out.println("wrong input ");
            System.out.print("enter marks of Maths :");
            m=sc.nextInt();
        }   
        System.out.print("\033c");
        System.out.print("enter marks of Science :");
        s=sc.nextInt();
        while(s>100||s<0)
        {
            System.out.print("\033c");
          System.out.println("wrong input ");
            System.out.print("enter marks of Science:");
            s=sc.nextInt();
        }   
        System.out.print("\033c");
        System.out.print("enter marks of Geography :");
        g=sc.nextInt();
        while(g>100||g<0)
        {
            System.out.print("\033c");
          System.out.println("wrong input ");
            System.out.print("enter marks of Geography:");
            g=sc.nextInt();
        }   
        System.out.print("\033c");
        obj1[i]=new Student(m,e,g,s,mar);
      obj1[i].calculate();
    }
 for(i=0;i<nn;i++)
 {
    System.out.println(" Details of Student number ::"+(i+1));
    obj1[i].display();
 }
}
}
//