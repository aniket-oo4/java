
import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        int row,j,n,col;
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       
        for(row=0;row<=n;row++)
        {
            
            for(j=0;j<=n;j++)
            {
              col=j;  
            int print= (row>col?row:col)>(n-row>n-col?n-row:n-col)?(row>col?row:col):(n-row>n-col?n-row:n-col);
System.out.print(print+"  ");
            }
            System.out.print("\n\n");
        }
    }
}
