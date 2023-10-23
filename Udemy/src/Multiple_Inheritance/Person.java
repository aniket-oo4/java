package Multiple_Inheritance;
import Abstract_class.*;

public class Person   implements IsAlive,LiveLife  {
	public void breath()
	{
		System.out.println("Breath");
	}
	public void message() {
		System.out.println("Life is Rat race be a Fluet Master ");
	}
public void speak() {
	System.out.println("Hello this is my speak ");
}
}
