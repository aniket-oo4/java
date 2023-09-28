public class demo2 {
 public static void main(String args[])
 {
    demo2 obj=new demo2();
    System.out.println(obj.toString());
    
    System.out.println(obj);//both are same 
 }
}
/*
 * // Default behavior of toString() is to print class name, then
// @, then unsigned hexadecimal representation of the hash code
// of the object

public String toString()
{
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
demo2@2c7b84de

 */
