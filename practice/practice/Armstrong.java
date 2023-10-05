
import java.util.*;
public class Armstrong{
    public static void main(String args[])
    {
        int n,temp,rem=0,sum=0;
        System.out.println("enter n: :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            
            temp=i;
            sum=0;
            while(temp>0)
            {
                rem=temp%10;
                sum+=rem*rem*rem;
                temp=temp/10;
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }

    }
}
