import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("how many rows do you want :");
        n=sc.nextInt();
        // for(i=1;i<=n;i++)
        // {
        //     for(int k=1;k<=n-i;k++)             // or use if else condition if(j<=n-1) print(" ") else print("*")
        //     {
        //         System.out.print(" ");
        //     }
        //     for(j=1;j<=i;j++)
        //     {
        //      System.out.print("*");   
        //     }
        //     System.out.print("\n");  
        // }
        /*
             *
            **
           ***
          ****
         *****
         */
        
         for(i=1;i<=n;i++)
         {
             for(j=1;j<=n;j++)
             {
                if(j<=n-i) 
                System.out.print((" "));
                else
                 System.out.print((j-(n-i)));

             }
         System.out.print("\n");
         }
    //       1
    //      12
    //     123
    //    1234
    //   12345
      for(i=1;i<=n;i++)
         {
             for(j=1;j<=n;j++)
             {
                if(j<=n-i) 
                System.out.print((" "));
                else
                 System.out.print("*");

             }
         System.out.print("\n");
         }      
    //       *
    //      **
    //     ***
    //    ****
    //   ***** 
    }
}
