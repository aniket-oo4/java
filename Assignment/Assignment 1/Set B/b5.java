import java.util.*;

public class b5 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rows :");
        int n=sc.nextInt();
        int print=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                if(print==1)
                print=0;
                else
                print=1;
                System.out.print(print);
            }
            System.out.println();
        }
    }
}
/*
1
01
010
1010
 */
