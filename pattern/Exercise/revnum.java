import java.util.Scanner;
public class revnum{
    public static void main(String args[])
    {
        int num,rev=0,rem=0;
        Scanner sc1=new Scanner(System.in);// it is mandatory to initialize the object of Scanner class 
        System.out.println("enter number to reverse :");
        num=sc1.nextInt();
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;// form sum of digits sum=sum+rem for armstrong  sum=sum+rem*rem*rem;
            num=num/10;
        }
        System.out.println("reversed number is ::"+rev);
        
    }
    
}
