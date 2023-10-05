package practice;

public class string1 {// strings are immutable that means string will not change it is fixed value but we can perform operation by using string functionss .

    
    public static void main (String args[])
    {
        System.out.print("\033c");
        String str="hello bhava ";
        str=str.toLowerCase();
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);
        str=str.replace("A","#");// replace function replaces all the occurence of first parameter by second one
        System.out.println(str);
        String str2="dear <|name|> how are  you";//string teplate 
        System.out.println(str2);
        // str2=str2.replace("<|name|>","harry");
        // System.out.println(str2);
        str2=str2.replace("<|name|>","vayuu");
        System.out.println(str2);
        System.out.println(str2.indexOf("  "));// -1 if not present
    }
}
