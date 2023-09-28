package practice;
public class Mymath{
 int x,y,c;
public Mymath(){}
public Mymath(int a,int b)
{

this.x=a;this.y=b;
}
 public Mymath(int a,int b,int c)
{

this.x=a;this.y=b;this.c=c;
}
public int addTwo(int a,int b)
{
return  (a+b);
}
public int addThree(int a,int b,int c)
{
return  (a+b+c);
}
public static void main(){
    upper.inner obj =new upper.inner();
}

}
class upper{
     static class inner {
        inner()
        {
            System.out.println("inner lass");
        }
     }
     upper(){
        System.out.println("upper class ");
     }
}

