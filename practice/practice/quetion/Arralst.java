
import java.util.*;

public class Arralst {
    

    public static void main(String args[])
    {
        ArrayList <Integer> lst=new ArrayList<>();

        int n,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n :");
        n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.println("enter value for pos :"+i+1);
            num=sc.nextInt();
            lst.add(num);
        }
        int l=lst.size();
        System.out.println("lst before reverse :"+lst);
        System.out.println("lst in reverse:");
        for(int i=l-1;i>=0;i--)
        {

            System.out.print(lst.get(i)+"  ");
        }
    }
}
