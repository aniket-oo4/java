import db_objects.*;
import guis.BankAppGui;
import guis.LoginGui;
import guis.RegisterGui;

import javax.swing.*;
import java.math.BigDecimal;

public class AppLauncher {
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new LoginGui().setVisible(true);
//                new RegisterGui().setVisible(true);
//                System.out.println(user.getUsername()+" "+user.getId());


//                new BankAppGui(new User(1,"name","pass",new BigDecimal(3424))).setVisible(true);


            }
        });

    }
}
