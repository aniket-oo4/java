  class  A1{
    void method1(){
        System.out.println("method in A1");
    }
   }
 class  A2 extends A1{
    @Override
    void method1(){  //  method12()  method does not override or implement a method from a supertype
   
        System.out.println("method in A2");
    }
   }
   public class method_overriding{
    public static void main (String args[])
    {
       A2 obj=new A2();
       obj.method1();
    }
}