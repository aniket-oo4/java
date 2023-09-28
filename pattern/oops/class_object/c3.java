
import java.util.Scanner;

 class student {
    int id, age;
    String name;
    String gender;

    student(student obj2)  //Copy constructor 
     {
       this.id=obj2.id;
       this.name=obj2.name;
    }
    student(){

    }// defined for obj 1 who do not accepting another object as parametr 

    public void display() {
        System.out.println("ID ::" + id + "\n");
        System.out.println("NAME ::" + name + "\n");
        // System.out.println("AGE ::" + age + "\n");
        // System.out.println("GENDER ::" + gender + "\n");
    }
}

public class c3 {
    public static void main(String[] args) {
        student obj1 =new student();
        obj1.id=1;
        obj1.name="tatya mahakal";
        student obj2=new student(obj1);
        obj2.display();
        // obj2.name="hello:";
        // obj1=new student(obj2);
        // obj1.display();
    }

}
