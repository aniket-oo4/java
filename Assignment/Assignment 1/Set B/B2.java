
import java.util.*;
public class B2{

    public static void main(String[] args) {
        int n,temp,j,i;
       
        System.out.println("enter value for n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         int arr[]=new int[n];
            for( i=0,j=0;i<n;i++)
            {
                System.out.println("Enter number:");
                temp=sc.nextInt();
                int num=temp,sum=0;
                while(temp!=0)
                {
                    int rem=temp%10;
                    sum=sum+(rem*rem*rem);
                    temp/=10;
                }
                if(sum==num)
                    {arr[j]=num;j++;}
            }
        for(i=0;i<j;i++)
        {
            System.out.println(arr[i]);
        }
    }
}