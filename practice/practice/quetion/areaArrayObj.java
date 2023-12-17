import java.util.Scanner;

public class areaArrayObj {

    public static void main(String args[]) {

        float l, w,r=0.3f;
        System.out.println("enter length ,width , and radius :");
        Scanner sc = new Scanner(System.in);
        l = sc.nextFloat();
        w = sc.nextFloat();
        // r = sc.nextFLoat();
        Rectangle rec = new Rectangle();
        Circle circ = new Circle();
        rec.area(l, w);
        circ.area(r);
    }
}

class Shape{

    void area() {
        System.out.println("hello");
    }
}

class Rectangle extends Shape {

    void area(float l, float w) {
        System.out.println("area of Rectangl :" + (l * w));
    }

}

class Circle extends Shape {

    void area(float r) {
        System.out.println("area of Rectangl :" + (r * r * 3.14));
    }

}
