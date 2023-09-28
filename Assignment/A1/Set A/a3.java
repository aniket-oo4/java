import java.util.*;
public class a3 {
                            
          public static void main(String args[])
           {    
              String ename;
              Scanner  sc=new Scanner(System.in);   
              System.out.println(" Enter emoloyee name :::");
              ename=sc.nextLine();
              for(int i=ename.length()-1;i>=0;i--)
              {
                System.out.print(ename.charAt(i));
              }              
           }   
              
}
