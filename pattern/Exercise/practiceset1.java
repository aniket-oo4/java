import java.util.Scanner;

public class practiceset1 {
    public static void main(String args[])
    {
        System.out.println("enter your number ::");
        Scanner sc=new  Scanner(System.in);
        if(!sc.hasNextInt())
        System.out.println("numeber is not integer ");
        else
        System.out.println("number is ineter ");
        
    }
}
