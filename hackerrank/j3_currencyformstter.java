public class j3_currencyformstter {
    import java.util.*;
import java.text.*;

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale ind=new Locale("en","IN");
        NumberFormat formatter=NumberFormat.getCurrencyInstance(Locale.US);
        String us=formatter.format(payment);
        formatter=NumberFormat.getCurrencyInstance(ind);
        String india=formatter.format(payment);
        formatter=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=formatter.format(payment);
        formatter=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=formatter.format(payment);
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
/*
 * 
 sample input
 12324.134

 sample output
 US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
 */
