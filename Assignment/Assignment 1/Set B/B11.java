
import java.util.*;
public class B11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter hoW many cities you want ::");
        n = sc.nextInt();
        String arr[] = new String[n];
        int len = arr.length;
        System.out.println("enter " + n + "cites ::");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n-1; i++) {
            int cmp=arr[i].compareTo(arr[i+1]);
            System.out.println(cmp);
            String temp=new String();
            if(cmp>0)
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        System.out.println("Cities after sorting ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
