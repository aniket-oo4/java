package Abstract_class;
public abstract class Person{// abstract class
	public void speak() {
		System.out.println("Shared his thought ::");
		
	}
	public abstract void eat();// abstract method 
	
}
class Vegan extends Person{
	public void eat()
	{
		System.out.println("eats veg");
	}
}
class NonVegan extends Person{	
	public void eat()
	{
		System.out.println("Eat NO Veg");
	}
}