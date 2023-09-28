import java.util.*;
class myInteger{
    public static int value;
   public
    myInteger(int n)
    {
        this.value=n;
    }
}
public class c_2autoboxing {


    public static void main(String args[])
    {
        // ArrayList<Integer> lst=new ArrayList<>();  // here we used Integer class which is pedefined wrapper class in java 
        ArrayList<myInteger>lst=new ArrayList<>(null);
        lst.add(new myInteger(22));
        System.out.println(lst.get(0));
    }
}
