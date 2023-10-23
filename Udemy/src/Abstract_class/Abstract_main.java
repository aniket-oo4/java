package Abstract_class;
//import InnerClass.*;
import Abstract_class.Vegan;
public class Abstract_main {
public static void main(String args[])
{
	Person obj;
	obj=new Vegan();
	obj.eat();
	obj=new NonVegan();
	obj.eat();obj.speak();
	
}


}
