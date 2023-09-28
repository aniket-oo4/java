package OOP;

  class a{
	
	void display() {
		System.out.println("firs classs");
		
	}
  }
class B extends a{
		
		static class in{
			a obj=new a();
		}
	}
	


public class static_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B.in obj1=new B.in();// used because we declared inner class as static it does not belongs to object of parent class it belongs
		// to parent classs hence we are using class name for accessing inner calss				
		obj1.obj.display();
;
	}

}
