package Assignment;
import java.util.*;
class Teacher{
	int T_id;
	String des,name,subject;
	float sal;
	Teacher(){}
	Teacher(int id,String d,String n,String sub,float s)
	{
		this.T_id=id;
		this.des=d;
		this.name=n;
		this.subject=sub;
		this.sal=s;
	}
	void display() {
		System.out.println("Details of teacher as Follows :::");
		System.out.print("Name ::"+name+" \n ID ::"+T_id+" \n Designation ::"+des+" \n Teaching subject ::"+subject+" \n Salary ::"+sal+"\n");
	}
	
}

public class A3P2 {

	public static void main(String[] args) {
		int n,id;
		float sal;
		String name,des,sub;
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER HOW  many teachrs you want ::");
		n=sc.nextInt();
//		sc.next();
		Teacher []obj=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER ID ::");
			id=sc.nextInt();
			System.out.println("ENTER name ::");
			name=sc.next();
			System.out.println("ENTER Subject ::");
			sub=sc.next();
			System.out.println("ENTER Designation  ::");
			des=sc.next();
			System.out.println("ENTER Sallary ::");
			sal=sc.nextFloat();
			obj[i]=new Teacher(id,des,name,sub,sal);			
		}

		for(int i=0;i<n;i++)
		{
			if(obj[i].subject.equals("Java")||obj[i].subject.equals("java")||obj[i].subject.equals("JAVA"))
			{
				obj[i].display();
			}
		}
	}

}
