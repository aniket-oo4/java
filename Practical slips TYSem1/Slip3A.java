import java.util.*;
public class Slip3A{

public static void isArmstrong(int num) // static keyword  used here
  {

     int rem=0,sum=0,temp=num;
  	while(temp>0)
		{
		    rem=temp%10;
		    sum+=rem*rem*rem;
		    temp/=10;
		}
  if(sum==num)
	{
	System.out.println("The number is Armstrong ");
        }
  else 
	{
	  System.out.println("The number is not a Armstrong number :");	
	}
  }
public static void main(String args[])
 {

int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter a Number ::");
num=sc.nextInt();
isArmstrong(num);

 }



} 