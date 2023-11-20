
 
public class demo2 {
    
    static //this will executes automatically 
    {
 System.out.println("hello this is static block");
 demo2 obj=new demo2();
 
 obj.display();
    }
    void display()
    {
        System.out.println("hello display");
    }
    public static void main(String args[])
 {

    // System.out.println(fibonacci(1));
 }
}
/*
 * // Default behavior of toString() is to print class name, then
// @, then unsigned hexadecimal representation of the hash code
// of the object

public String toString()
{
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
demo2@2c7b84de

//  */
// double[] obj=new double []{12,43,45,66,};
//      double total=0;
//         for (double i: obj)
//         {
//             System.out.print("  "+i);
//             total+=i;
//         }
//         System.out.println("total of following double array is :"+total);
//         System.out.println("total of following double array is :"+obj.toString());
    


// class passDemo{
//         int a,b;

//     passDemo(int a,int b)
//     {
//         this.a=a;
//         this.b=b;
//     }
//     boolean equalTo(passDemo obj)
//     {
//         if(this.a==obj.a&&this.b==obj.b)
//             return true;
//         else 
//             return false;
//     }
// }



// class one{
//     int a;
//     one(){
//         a=10;
//     }
//     void display()
//     {
//         System.out.println("a1 is ::"+a);
//     }
//     void display(int a)
//     {
//            this.a=a;
//       System.out.println("a2 is ::"+a);
//     }

//  }
//  class two extends one{
//     int b;
//     two()
//     {
//         b=22;
//     }
//     void display()
//     {
//   super.display();
//   super.display(89);
//   System.out.println("b is ::"+b);

//     }
//  }

 
//     int a,b;
//     demo2()
//     {
//         a=111;b=222;
//         System.out.println("this is default constructor::");
//     }
//     demo2(int a,int b)//overloading 
//     {
//         this.a=a;
//         this.b=b;
//     }
//     demo2(double x,double y)//overloading 
//     {
//         this.a=(int)x;
//         this.b=(int)y;
//     }

// void display()
// {
//     System.out.println(" a and b is :"+a+" "+ b);
    
// }
// static int factorial(int n)
//     {
//         if(n==0)
//             return 1;
//         else    
//             return (n*factorial(n-1));
//     }