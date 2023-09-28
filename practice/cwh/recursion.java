
import java.util.*;
public class recursion {
    static int factorial(int num)
{
    if (num==0||num==1)
    {
        return 1;
    }
    else{
        return num*factorial(num-1);
    }

}  
  public static void main(String args[])

    {
        int facto=1;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number here :");
        num=sc.nextInt();
        // factorial is  == factorial of 5 is  5*4*3*2*1;  and factorial of 0 is always 1 
// while(num>0)  // without recursion
// {
//     facto*=num;
//     num--;
// }
System.out.println("Factorial of num: "+num+" is :"+factorial(num));
    }
}
