import java.util.*;
public class Slip2A{

public static void main(String args[])
 {

String str;
Scanner sc=new Scanner(System.in);
System.out.println("enter a String ::");
str=sc.nextLine();
 
   for(int i=0;i<str.length();i++)
	{
	   			  	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				System.out.print(str.charAt(i)+" ");
			}
	}
   

 }



} 