import java.util.*;
public class c3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        // int b[]=new int[4];

        a[0]=1;
        a[1]=3;
        a[2]=2;
        a[3]=5;
        int []b={12,42,2,3};
        System.out.println("union of two arrays are as follow:");
        for(int i=0;i <a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                System.out.println(a[i]);
                break;
                }
            }
        }

    }
}
