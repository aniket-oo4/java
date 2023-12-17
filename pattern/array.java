package pattern;

import java.util.*;

public class array {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("hpe many elements do you want :");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter values for array element ");
        for(int i=0;i<n;i++)
        {
            System.out.println("enter vslue for element::"+i);
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("value for element::"+i+" is:"+a[i]);
        }
     }
}
