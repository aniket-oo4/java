import java.util.Scanner;
public class p6{
    public static void main( String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,count,i,j,t1=1,t2=0;
        n=sc.nextInt();
        
        for(i=1,count=n;i<=n;i++,count--)
        {   
            
            for(j=1;j<=n;j++)
            {
              if(i==t1&&j==t1||j==n-t2&&i==n-t2)
                {System.out.print(count);}
              else
               {
                System.out.print(" "); 
              }
             
            }
            System.out.print("\n");
             t1++;
             t2++;
        
        }
    }
}
/*
10         
 9        
  8       
   7      
    6     
     5    
      4   
       3  
        2 
         1

*/