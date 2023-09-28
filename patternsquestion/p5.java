import java.util.Scanner;


public class p5 {
 public static void main(String[] args) {
    int i,j,n;
    Scanner sc=new Scanner(System.in);
    System.out.println(" how many rows do you want :");
    n=sc.nextInt();
    // System.out.println(" how many columns do you want :");
//    c=sc.nextInt();
    // for(i=1;i<=n;i++)
    // {
    //     for(j=1;j<=i;j++)
    //     {
    //         System.out.print(i);
    //     }
    // System.out.print("\n");
    // }
// 1
// 22
// 333
// 4444
// 55555
for(i=1;i<=n;i++)
    {
        for(j=n;j>=i;j--)//   for(j=1;j<=(n-i)+1;j--)
        {
            System.out.print(i);
        }
    System.out.print("\n");
    }
 }
// 11111
// 2222
// 333
// 44
// 5
}
