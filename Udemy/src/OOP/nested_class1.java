package OOP;

 class Outer
{
	 {// Anonymous class means the class whose does not have class name 
			System.out.println("hello annonymes");
	}// it will runt automatically when program will be compiled 
	void display()
	{
		System.out.println("its outer ");
	}
	
	  class inner{// static inner class  it is member inner class 
		void display() {
			System.out.println("hello inner");
			class local{// it is a local inner class 
				
			}
			
			
		}
	}
	
}

public class nested_class1 {

	
	public static void main(String[] args) {
	Outer obj=new Outer();
//	Outer.inner obj2=new Outer.inner();// declaring object in case if inner class is static  
	Outer.inner obj2=obj.new inner();// we will declare object of inner class if inner class is not static 
	obj2.display();
	obj.display();
//	Outer.inner obj2=new Outer.inner();/

	}

}
