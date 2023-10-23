import java.util.*;
 public class A3P4{


static void  display_vec(Vector<String> obj)
{
      for(int i=0;i<obj.size();i++)
	{
	  System.out.println(i+"th :"+obj.elementAt(i));	
	}
   
}
public static void main(String args[])
   {
    int n=args.length;
Vector<String> v=new Vector<String> (n);  

for (int i=0;i<n;i++)
 	{
	   v.add(args[i]);
	}
System.out.println("Clone:"+v.clone());   
     display_vec(v);
  System.out.println(" Capacity is :"+v.capacity());
     
   } 



}