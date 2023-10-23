import java.util.*;
             
public class p1
    {          
      public static void main(String args[])
       {
        String str1,str2="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        str1 =sc.nextLine();
        int len=str1.length();
        for (int i=len-1;i>=0;i--)
        {
          str2+=str1.charAt(i);
        }   
        if(str1.equals(str2))
        {
            System.out.println(str1+"  is palindrome string .");
        }
        else
        System.out.println(str1+"  is not as  palindrome string .");
    } 
}         