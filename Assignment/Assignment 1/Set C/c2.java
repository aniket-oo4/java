import java.util.*;
public class c2 {
    public static void main(String[] args) {
        System.out.println(" how many words do you want to store :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("enter "+n+"words ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        System.out.println("array before reversing ::");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        System.out.println("reversed array ::");
        for(int i=0;i<n;i++)
        {
            for(int j=a[i].length()-1;j>=0;j--)
            {
                System.out.print(a[i].charAt(j));
            }
            System.out.print(" ");
            
        }
    }
}
