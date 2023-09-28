import java.util.Scanner;
//  in order to read data from keyboard java has  Scanner class .
public class cwh_2input {
    public static void main(String args[])
    {
        System.out.println("its my first line of taking input from user on 1 july 2023:");
        Scanner sc=new Scanner(System.in);// Scanner is a predefined class in java  we are creating obj of this class whose name is  sc.
        // System.out.println("enter first number :\n");
        // int a=sc.nextInt();// next int is predefined function in Scanner class which takes integer input from user 
        // System.out.println("enter second number :\n");
        // int b=sc.nextInt();
        // int sum=a+b;
        // System.out.println("the sum of numbers are::");
        // System.out.println(sum);
        // System.out.println("enter float vlaue::");
        // float x=sc.nextFloat();
        // // x=90;
        // System.out.println(x);
        // boolean b1=sc.hasNextInt();// checking input is integer or not its a function in java Scanner class
        // System.out.println(b1);
        // System.out.println(":enter any string:");
        // String str=sc.next();// it takes  string input untill enter or space  only reads words
        // System.out.println(str);
         System.out.println(":enter any string:");
        String str2=sc.nextLine();// it takes  string input  total string 
        System.out.println(str2);
    }
}
