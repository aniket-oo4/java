package Inheritance;
//import Inheritance.Vehicle;
import java.util.Scanner;
import Inheritance.Vehicle;  //importing local  package   
public class I1 {
//inheritance is a best feature of oop because it increases the re-usability 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike obj=new bike();
		obj.name="hyboosa";
		obj.seats="2";
		obj.speed=120;
Car c1=new Car();
c1.doors=4;
c1.name="lambo";
System.out.println(c1.getClass());// used for getting class of object 
System.out.println(obj.name);
System.out.println(obj.seats);
	}

}
