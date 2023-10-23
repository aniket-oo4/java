import java.util.*;
public class c1 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=new String();
    System.out.println("enter your string here");
    str=sc.nextLine();
    for(int i=0;i<str.length();i++)
    {
        int count=0;
        for(int j=i;j<str.length();j++)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                count++;
            }
        }
            System.out.println("character :"+str.charAt(i)+"::"+count);
    }
 }   
}