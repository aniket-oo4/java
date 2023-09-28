package Basics;
import java.util.*;
public class type_cast {

	public static void main(String[] args) {
		short x=1; //implicit means automatically   if we trying to store lower data in higher datatype then we use widening implicit typecasting 
		int y=x;// it was implicit typecasting . means it was done by compiler by itself no need to write it in the code  
		long z=y; //  implicit typecasting supports flow low data types to high == byte->short->->int->long->float->double ->stringwe cannot convert them into reversed order 
		// i.e int cannot be converted into short
//		x=z;  Type mismatch: cannot convert from long to short
		System.out.println(z);
// when there is narrowing situation we use explicit typecasting means in higher to lower  ex= int ->short->byte
		x=(short)z; // explicit typecasting 
System.out.println(x);
float a=1.0f; // f defines value is float
double b=12.30d;
b=a;// there is no error because it do implicit typecasting 
//a=b;type mismatch: cannot convert from double to float
a=(float)b;// explicit typecasting
// in java we cannot convert String from Int  

//remember the concept overflow exceeds data type storing limit 

	}

}
