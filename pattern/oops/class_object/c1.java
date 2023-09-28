
import java.util.Scanner;
class student
{
    Scanner sc=new Scanner(System.in);
   int id,age;
   String name;
   String gender;
   student()
   {
     System.out.println("enter student name :");
     name=sc.nextLine();
     System.out.println("enter student Gender :");
     gender=sc.nextLine();
     System.out.println("enter student id :");
     id=sc.nextInt();
     System.out.println("enter student  Age :");
     age=sc.nextInt(); 
     System.out.println("/n Information Stored successfully \n"); 
    }
    public void display(){
      System.out.println("ID ::"+id+"\n");
      System.out.println("NAME ::"+name+"\n");
      System.out.println("AGE ::"+age+"\n");
      System.out.println("GENDER ::"+gender+"\n");  
    }
}

public class c1{
  public static void main(String[] args) {
     student obj1=new student();// this line is compulsary to declare an object of specific class .
     
    //  obj1.age=12;
    //  obj1.id=1;
    //  obj1.gender="male";
    //  obj1.name="aniket vakrhade ";
     obj1.display();    
    }
       
}
