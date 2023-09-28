
 class Phone {
    public  String model;
    Phone(){
        System.out.println("constructor of parent ");
    }
 }
 class Demo extends Phone
{
    
   public  Demo(){
        super();
        System.out.println("constructor of demo  ");

    }
   
}
public class Myclass {
     public static void main(String args[])
     {
        Demo obj;
        obj=new Demo();
        obj.model="djdj";
     }
}
