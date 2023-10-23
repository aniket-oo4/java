import java.util.*;

class Doctor{
    int Dno;
    String name,qualification,specialization;
    Scanner sc=new Scanner(System.in);

    Doctor()
    {
        System.out.println("enter : doctor number :");
        Dno=sc.nextInt();    
        System.out.println("enter : doctor  name  :");
        name=sc.next();
        System.out.println("enter : doctor qualification  :");
        qualification=sc.next();
        System.out.println("enter : doctor Specialization  :");
        specialization=sc.next();
    }
    void display()
    {       
         System.out.println(" doctor number :"+this.Dno);
        
        System.out.println(" doctor  name  :"+this.name);
        
        System.out.println(" doctor qualification  :"+this.qualification);

        System.out.println(" doctor Specialization  :"+this.specialization); 
    }
}
public class P3{
    
    public static void main(String Srgs[])

{
    
    int n,i;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter n :");
    n=sc.nextInt();
    Doctor[] obj=new Doctor[n];
   for(i=0;i<n;i++)
   {
    obj[i]=new Doctor();

   }
   System.out.println("Before  changing  :: *****");
   for(i=0;i<n;i++)
   {
    obj[i].display();
   }
   Doctor temp;
   for(i=0;i<n-1;i++)
   {
    
    for(int j=i+1;j<n;j++)
    {
      if(obj[i].name.compareTo(obj[j].name)>0)
      {
         temp=obj[i];
         obj[i]=obj[j];
         obj[j]=temp;
      }

    }
   }

   System.out.println("Aftere  changing  :: *****");
   
   for(i=0;i<n;i++)
   {
    obj[i].display();
   }

}
}
