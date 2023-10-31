package AWT.Applet_1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Prodemo extends Applet implements ActionListener{



    TextField tf1,tf2;
    int x=0,y=0,prod=0;
    String s1,s2,s3;
    Button b1;
    public void init()
    {
        tf1=new TextField(10);
        tf2=new TextField(10);
        b1 =new Button("CLivck me  ");
        add(tf1);
        add(tf2);
        add(b1);
        tf1.setText("0");
        tf2.setText("0");
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==b1)
        {
            s1=tf1.getText();
            x=Integer.parseInt(s1);
            s2=tf2.getText();
            y=Integer.parseInt(s2);
            prod=x*y;
            repaint();

        }
    }
    public void pain(Graphics g)
    {
        g.drawString(" Enter number int the given textboxes ",10,80);
        g.drawString("The product is ::", 10,200);
    }
}

