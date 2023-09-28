import encapsulation.Person;
public class hello {
    public static void main(String args[])
    {
        Person obj=new Person();
        // obj.name="hello bhava";  it is not accessible when name is private property of class Person 
        // to  chaneg the private properties of class then define methods such as set name or setAge etc () by using functions we can change those private properties 
        System.out.println(obj.toString());
        obj=new Person(12,"shad","shd"); //changin reference object  address  
                System.out.println(obj.toString());


    }
}
