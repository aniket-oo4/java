
import java.util.*;

public class A2 {

    boolean isperfect(int a)
    {
        int sumfact=0;
        // if(a==1)
        //     return true;
        // else{
        for(int i=1;i<=(a/2);i++)
        {
            if(a%i==0)
                {
                    sumfact+=i;
                }
        }
        if(sumfact==a)
            return true;
        else    
            return false;
        // }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        A2 obj=new A2();
        System.out.println("enter  number for n :");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(obj.isperfect(i))
                System.out.println(i);
        }


    }
}
