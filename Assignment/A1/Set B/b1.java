import java.util.*;
public class b1{

public static void main( String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter hoe many cities you want ::");
n=sc.nextInt();
String arr[]=new String[n];
int len=arr.length;
System.out.println("enter "+n+"cites ::");
for(int i=0;i<n;i++)
{
    arr[i]=sc.next();
}
System.out.println("strings before sorting :");
for(int i=0;i<n;i++)
{
   System.out.println(arr[i]); 
}
Arrays.sort(arr);//function for sorting an array 
System.out.println("strings after sorting :");
for(int i=0;i<n;i++)
{
   System.out.println(arr[i]); 
}
Arrays.sort(arr,Collections.reverseOrder());//function for sorting an array 
System.out.println("strings after sorting descending  :");
for(int i=0;i<n;i++)
{
   System.out.println(arr[i]); 
}

}


}