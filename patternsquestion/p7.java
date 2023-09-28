import java.util.*;
public class p7 {
    
    public static void main( String args[])
    {
        int  i,j,space,row,col;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rowss:");
        row=sc.nextInt();
        // System.out.println("enter cols:");
        // col=sc.nextInt();
        for(i=1;i<=(row*2)-1;i++)
        {
            col=i>row?2*row-i:i; // if i becomes > than 5 6>5 then return 5*2 -6=4 
            // 10-i 7=3  || 10-i 8 =2  || 10-i 9=1 

            for(int k=1;k<=row-col;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=col;j++)
            {
             System.out.print("* ");// this space is very important to print the triangle withou this space it will print only sapce and end is in single colume 
            }
            System.out.print("\n");
        }



    }
}
