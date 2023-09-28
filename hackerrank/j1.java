import java.util.*;

public class j1 {

    public static void main(String[] args) {
        String str="\0";
        Scanner sc = new Scanner(System.in);
         
        int i = sc.nextInt();
        Double d=sc.nextDouble();
        sc.nextLine();
        str=sc.nextLine();
        

        System.out.println("String: " +str);
        System.out.println("Double: " +d);
        System.out.println("Int: " + i);
    }
}