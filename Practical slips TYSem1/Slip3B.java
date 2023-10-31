import java.util.*;

abstract class Shape{
  final float pi=(float)3.14;
    abstract void area();
     abstract void volume();

}

class Cone extends Shape{
   int radius ,height,length;
   Scanner sc=new Scanner(System.in);
 Cone(){
   	System.out.println("enter a radius of cone ::");
   	radius=sc.nextInt();
  	System.out.println("enter a height of cone ::");
   	height=sc.nextInt();
	System.out.println("enter a length of cone ::");
   	length=sc.nextInt();
    }
  void area() //πr(l + r)
   {
    float area=pi*radius*(length+radius);
	System.out.println("Area of Cone is "+area);
   
   }
void volume() //( pi* r*r*height  ) /3 
   {
    float volume= (pi*(radius*radius)*height)/3;
	System.out.println("Volume of Cone is "+volume);
   
   }

}
public class Slip3B{

public static void main(String args[])
 {

Scanner sc=new Scanner(System.in);
  Cone obj=new Cone();
  obj.volume();
  obj.area();

 }



} 