package guis;
import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

import db_objects.*;
//public abstract class Baseframe extends JFrame{
//
//
//
//}
public  abstract class BaseFrame extends  JFrame {


      protected  User user;
    public BaseFrame(String title,User user )  {
        this.user = user;
        initialize(title);
    }

    public BaseFrame(String title ) throws HeadlessException {
        initialize(title);
    }



    public void initialize(String title){
        setTitle(title);

        setSize(420,520);
        // size in pixels;

        setLayout(null);
        // to adjust components as per we needed

        setResizable(false);
        // disable maximize

        setLocationRelativeTo(null);
        // to open window in the center


        addGuiComponents();// function for adding components to frame

    }

    protected  abstract void  addGuiComponents();  // this method will be intialize by sub classes of this class  ie different Gui's are subclasses of this base frame

}
