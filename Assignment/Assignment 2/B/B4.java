package Assignment;


class MyNumber{
	
private int num;
	MyNumber()
	{
		num=0;
	}
	MyNumber(int a){
		num=a;
	}
	void isNegative()
	{
		if(num>0)
			System.out.println(num+" Is NOT NEGATIVE ::");
		else
			System.out.println(num +"  IS NEGATIVE" );
		
	}
	void isPositive()
	{
		if(num>0)
			System.out.println(num+" Is POSITIVE::");
		else
			System.out.println(num +"  IS  NOT POSITIVE" );
		
	}
	
}
public class B4 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		MyNumber obj;
		obj=new MyNumber(a);
		obj.isNegative();
		obj.isPositive();

	}

}
