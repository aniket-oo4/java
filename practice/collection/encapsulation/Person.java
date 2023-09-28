package encapsulation;
public class Person{
// public String  name ="john";
// public int age=12;
// public String gender ="male "; its not encapsulattion concept 
private  String name ,gender;
private int age;
public Person()
{
    name ="john";  // to make it encapsulated use private keyword 
  int age=12;
 String gender ="male ";
}
public Person(int age,String name,String gender)
{
    this .age=age;
    this. name=name;
    this .gender=gender;
}
public  String toString()
{
return "Person name::"+name+" age ::"+age+" gender ::"+gender;
}   
}