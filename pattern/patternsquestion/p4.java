import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("how many rows do you want :");
        n=sc.nextInt();
        // for(i=1;i<=n;i++)
        // {
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print(i);
        //     }
        //      System.out.print("\n");
        // }
        // 1
        // 22
        // 333
        // 4444
        // 55555
        int count=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
             System.out.print("\n");
        }
        // 1        Floyd's Triangel
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
    }
}
