import java.util.*;
class MyException extends Exception{

    public String toString() {
        return "Invalid String ";
    }
}

public class StringExcep {
    public static void main(String args[])

{
    try {

String str;
System.out.println("enter your string ");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
if(str.length()<7)
{
    throw new MyException();
}
else{

    System.out.println(str.toUpperCase());
   }
    }
    catch( MyException  e) 
    {
        System.out.print(e.toString());
    
    }
}
}
