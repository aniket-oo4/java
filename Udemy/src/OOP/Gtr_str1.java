package OOP;

// class is nothing but template of object 
// object has properties |states and object has behavior | functionalities 
// car is object - car has properties =window ,door,seats,breaks,engine
// behavior = applying break ,running opening windows,closing doors  
class Car{
	public Car(String door, String engine, String driver, int speed) {//parameterized constructor 
		this.door = door;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
	public Car()//default constructor 
	{
	}

	private String door,engine,driver;
//	public int speed;
	private int speed;
	
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setspeed(int speed)
	{
		speed=speed;//it doesn't konw which speed should be it is 
	}
	public void setspeed1(int speed)
	{
		this.speed=speed;
	}
	public int getspeed()
	{
		return speed;
	}
	
	public String run() {
		if(this.door.equals("closed")&& this.engine.equals("on")&&driver.equals("present"))
		return "running ";
		else
		return "not running";
	}
}
public class Gtr_str1 {

	public static void main(String[] args) {


		Car obj=new Car("closed","on","present",456);
//		obj.speed=1;
//		System.out.println(obj.speed);
//		obj.setspeed(10);
		System.out.println(obj.getspeed());
//		obj.setspeed1(10);
		System.out.println(obj.getspeed());
//		obj.setDoor("open");
		System.out.println(obj.getDoor());
		System.out.println(obj.run());
		
		
		
	}

}
