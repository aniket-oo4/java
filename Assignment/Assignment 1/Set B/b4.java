import java.util.Scanner;
public class b4 {
    public static void main(String args[])
           
       {   
            System.out.println("enter rows ::");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int i,j,count=5;
            for(i=n;i>=1;i--)
            {   
                for(j=i;j<=n;j++)
                {
                    System.out.print(j);
                }
                System.out.print("\n");
            }

           }
        }

           /*{   

            int i,j,count=5;
            for(i=1;i<=5;i++)
            {   
                for(j=count;j<=5;j++)
                {
                    System.out.print(j);
                }
                System.out.print("\n");
                count--;
            }

           } */