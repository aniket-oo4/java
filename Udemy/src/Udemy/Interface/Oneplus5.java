package Udemy.Interface;

public class Oneplus5 implements Phone {

	public String processor()// overriding 
	{
		return "Snapdragon";
	}
	public String OS() {  //overriding 
		return "4Gb ram";
	}
	public int memory() {//overriding
		return 128;
	}
	
}

