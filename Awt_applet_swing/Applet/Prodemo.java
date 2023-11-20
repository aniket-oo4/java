 import java.awt.*;
import  java.applet.*;
import java.awt.event.*;
import java.awt.Graphics;


// public class Prodemo extends Applet implements ActionListener{
    
public class Prodemo extends Applet {
    
// TextField tf1,tf2;
// int x=0,y=0,prod=0;
// String s1,s2,s3;
// Button b1;
// public void init ()
// {
//     tf1=new TextField(10);
//     tf2=new TextField(10);
//     add(tf1);
//     add(tf2);
//     add(b1);
//     tf1.setText("0");
//     tf2.setText("0");
//     b1.addActionListener(this);

// }

// public void actionPerformed(ActionEvent e)
// {

// if(e.getSource()==b1)
// {
//     s1=tf1.getText();
//     x=Integer.parseInt(s1);
//     s2=tf2.getText();
//     y=Integer.parseInt(s2);
//     prod=x*y;
//     repaint();

// }
// }

// public void paint(Graphics g)
// {

//     g.drawString("enter numbesrs in this textboxes : ",30,80);
//     g.drawString("The product is :"+prod,10,200);
// }
public void paint(Graphics g)
{

  setBackground(Color.orange);
  Font f=new Font("Impact",Font.ITALIC,22);
  g.setFont(f);
  g.setColor(Color.red);
  g.drawString("ABCDEFGHIJKLMNOPQRSTUVWXYZ",300,300);
}

}
