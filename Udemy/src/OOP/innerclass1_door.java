package OOP;
import java.util.*;
public class innerclass1_door {

	lock obj=new lock();
	public innerclass1_door()
	{
		
	}
	public void status()
	{
		if(obj.Lock)
		{
			System.out.println("shop is opened ");			
		}
		else
			System.out.println("Shop is closed !");
	}
public static class lock{
		public boolean Lock;
		lock()
		{
			System.out.println("enter shop is closed or open false || true");
			Scanner sc= new Scanner(System.in);
			Lock=sc.nextBoolean();
		}
		
	}
}
