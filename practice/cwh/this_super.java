import java.util.*;

class The{

    int x,y;
     The( int x,int y)
     {

        this.x=x;this.y=y;
                System.out.println("x ans y is :"+x+" "+y);

     }
     void returnvalue()
     {
        System.out.println("x ans y is :"+x+" "+y);
     }
}


class The2 extends The{

    int x,y;
    The2( int a,int b,int x,int y)
    {
        super(a,b);  // super is a reference variable which is used to access parent class constructor ,method and specific argument 
        this.x=x;this.y=y;
        System.out.println("a ans b is :"+this.x+" "+y);
        
    }
       void returnvalue()
     {
        System.out.println("a ans b is :"+this.x+" "+y);
        super.returnvalue();
     }
}
class The3 extends The2{
    int z;
    The3(int a,int b,int c,int d,int e)
    {
        super(a,b,c,d);
        z=e;
        System.out.println("z is :"+z);
    }
       void returnvalue()
     {
        System.out.println("z is :"+z);
        super.x=7000;// super keyword to access  variable 
        super.returnvalue(); // super keyword to access function 
     }
}
public class this_super {
    


    public static void main(String args[])
    {
         
        The3 obj=new The3(78,90,78,88,8);
        // obj.returnvalue();
        
    }
}
