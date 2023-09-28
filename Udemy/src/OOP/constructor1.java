package OOP;
import java.util.*;
class student{
	int id;
	String name;
	student()
	{
		System.out.println("Enter name and roll no ::");
		Scanner sc= new Scanner(System.in);
		name=sc.nextLine();
		id=sc.nextInt();
	}
	void display() {
		System.out.println("NAME ::"+name+"\n id ::"+id);
	}
}
public class constructor1 {
//constructor gives us better control you can play around constructor how to apply constructor is depend upon you
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj=new student();
		obj.display();
		

	}

}
