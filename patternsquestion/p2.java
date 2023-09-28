
import java.util.Scanner;
public class p2{
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("how many rows do you want :");
        n=sc.nextInt();
        System.out.println("how many cols do you want :");
        int c=sc.nextInt();
        // for(i=1;i<=n;i++)
        // {
        //     for(j=1;j<=c;j++)
        //     {
        //         if(i==1||i==n){
        //             System.out.print("*");
        //         }
        //         else if(j==1||j==c){
        //         System.out.print("*");
        //         }
        //         else{
        //         System.out.print(" ");
        //         }
        //     }
        //     System.out.print("\n");
        // }
        
// *****
// *   *
// *   *
// *   *
// *****

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=c;j++)
            {
                if(i==1||i==n||j==1||j==c){
                    System.out.print("*");
                }
                else if(j==c-i){
                System.out.print("*");
                }
                else if(j==i){
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        // ************
        // **       * *
        // * *     *  *
        // *  *   *   *
        // *   * *    *
        // *    *     *
        // *   * *    *
        // *  *   *   *
        // * *     *  *
        // **       * *
        // ************
    }
}
