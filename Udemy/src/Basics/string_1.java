package Basics;
import java.util.*;
public class string_1 {  // basiccally String is a classs in java and we are declaring the objects of that class 

	public static void main(String args[])
	{
		String str="hello world \u01BB ?";// unicode table for \u01BB =?
		System.out.println(str);
		String var1,var2;
		var1="10";
		var2="20";
		System.out.println(var1+var2); //out put should be concatenation of two strings 
		int var3=10;
		System.out.println(var3+var2); // if we add one integer or any numeric data type to string then it will be typecasted automatically into String data type 
		System.out.println(var3+var2); 
		// we can also declare string as this it was proper way 
		String obj=new String("hello world");
		System.out.println(obj);
	}
}
