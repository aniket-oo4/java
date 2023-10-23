package Basics;
import java.math.BigDecimal;// big decimal is use to handle problems of values having big decimal vlaues that means they having long precisions 
public class Big_Decimal { 
 
	public static void main(String args[])
	{
		double x=1.05;
		double y=2.55;
		System.out.println(x+y);// it will return  wrong value 3.5999999999999996 th
		BigDecimal d1=new BigDecimal(1.05);
		BigDecimal d2=new BigDecimal(2.55);
		System.out.println(d1.add(d2)); // it will return 3.5999999999999998667732370449812151491641998291015625 this value
		BigDecimal d3=new BigDecimal("1.05");
		BigDecimal d4=new BigDecimal("2.55");
		System.out.println(d3.add(d4)); // it will return 3.60  this value
	}
}
