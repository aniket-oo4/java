package OOP;
import java.util.*;
public class Gtr_str2 {

	public static void main(String[] args) {
		System.out.println("hello world");

		Car obj=new Car();//another class's object declared in this class because this car class is also in same package  
//		obj.speed=1;
//		System.out.println(obj.speed);
		obj.setspeed(10);
		System.out.println(obj.getspeed());
		obj.setspeed1(10);
		System.out.println(obj.getspeed());
		obj.setDoor("open");
		System.out.println(obj.getDoor());
		
	}
	

}
