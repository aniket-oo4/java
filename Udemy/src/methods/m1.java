package methods;
import java.util.*;
// we cannot define any method within any method  but  not outside the class 
// there total four access modifiers in java default ,public,private and protected when we cannot defin access modifier then it will be default s
// scope of default is limited to this package only no out siders can access this members or methods 
// if public then anyone can access // if protected then only those who are child classes of this class they access it 
// private in this case no any other classes objects  have access  scope is limited for only this class 
public class m1 {

	public static void main(String[] args) {
		
		loop1();
		System.out.println("*********");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to start");
		int a=sc.nextInt();
		loop2(a);

	}
public static void loop1()// we madeit static because that methods accessible without creating an object of that class 
{ int i=1;
	while(i<=10)
	{
		System.out.println(i);
		i++;
	}
}
public static void loop2(int x)// there are no same name methods in same class 
{ int i=x;
	while(i<=x+10)
	{
		System.out.println(i);
		i++;
	}
}

}
