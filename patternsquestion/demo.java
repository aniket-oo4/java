import java.util.Scanner;
public class demo{
    public static void main(String args[])
    {
        int n,t=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        n=sc.nextInt();
        while(t>0)
        {
            for(int i=0;i<n;i++)
        {
            System.out.print("              ");
            if(i<n/2){
                for ( int j=0;j<i;j++){
                    System.out.print("*");
                    }
                    System.out.print("\n");
            }
            else{
                  for ( int j=n;j>i;j--)
                  {
                    System.out.print("*");
                    }
                    System.out.print("\n");
                }

        }
        n+=10;
    t-=1;
}
    }
}