
import java.util.*;
import java.io.*;

public class j2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum=a;
            int temp=1;//for multiplication 
            for(int j=1;j<=n;j++)
            {
              sum+=temp*b;
              System.out.print(sum+" ");
              temp=temp*2;  
            }
            System.out.print("\n");
        }
        in.close();
    }
}
// Sample Input

// 2
// 0 2 10
// 5 3 5


/*We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

We use  a=0,b=2 , and n=10 to produce some series : s0,s1,...sn-1;
s0=0+1*2(b)=2
s1=0+1*2+2*2=6;
s2=0+1*2+2*2+4*2;

... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.
***
We use , , and  to produce some series :
******** other solution :::


import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t1=sc.next();
        int t=Integer.parseInt(t1);
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
           for(int j=0;j<n;j++)
           {
           		int x=a;
           		for(int k=0;k<=j;k++)
           		{
           			x=x+(int)Math.pow(2,k)*b;
           		}
           		System.out.print(x+" ");	
           }
           System.out.println(); 
        } 
    }
}


 */