

class student
{

   int id,age;
   String name;
   String gender;
   student(int i,int a,String n,String g)/// parameterised constructor
   {
    this.id=i;
    this.age=a;
    this.name=n;
    this.gender=g;
   }
   public void display(){
      System.out.println("ID ::"+id+"\n");
      System.out.println("NAME ::"+name+"\n");
      System.out.println("AGE ::"+age+"\n");
      System.out.println("GENDER ::"+gender+"\n");  
    }
};
public class c2{
    public static void main(String[]args){
        student obj1= new student(1, 19, "tatya vinchu", "male");
        obj1.display();
    
}


}
