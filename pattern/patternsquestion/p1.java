import java.util.Scanner;
public class p1{
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("how many rows do you want :");
        n=sc.nextInt();
        // for(i=1;i<=n;i++)
        // {
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.print("\n");
        // }
        /*
1
12
123
1234
12345 */

// for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
        /*
*
**
***
****
*****
******
         */
        // for(i=1;i<=n;i++)//i=n;i>=1;i--
        // {
        //     for(j=n;j>=i;j--)  // j=1;j<=i;j++
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }
        /*
*****
****
***
**
*
         */
         for(i=1;i<=n;i++)
        {
            if(i<=(n/2)){
                for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            }
            else{
            for(j=n;j>=i;j--)
            {
                System.out.print("*");
            }
        }
            System.out.print("\n");
        }
        /*
           
            *
            **
            ***
            ****
            *****
            ******
            *******
            ******
            *****
            ****
            ***
            **
            *
         */
    }
}


