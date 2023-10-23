package Udemy.Interface;
import Udemy.Interface.Oneplus5;
public class PhoneMain {

	public static void main(String args[])
	{
		Phone obj;// we can create reference of interface which is use to switch and use all classes which are implementing such interface 
		obj=new Oneplus5();
		System.out.println("processor is : "+obj.processor());
		System.out.println("Operating System : "+obj.OS());
		System.out.println("  Memory in GB : "+obj.memory());
	}
}
