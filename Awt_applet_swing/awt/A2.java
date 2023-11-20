import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class A2 extends MouseAdapter{
    Frame frame;
    A2()
    {
      frame=new Frame();
     frame.setVisible(true);
     frame.setBackground(Color.gray);
     frame.setTitle(" MY FRAME ");
     frame.addWindowListener(new WindowAdapter() {
       @Override

       public void windowClosing(WindowEvent e)
        {
        frame.dispose();
}
     });

     frame.addMouseListener(this);


}
public void mousePressed(MouseEvent z)
{
    
Graphics g=frame.getGraphics();
g.setColor(Color.WHITE);
g.fillOval(z.getX(), z.getY(),50, 50);
}
public void mouseClicked(MouseEvent e)
{
Graphics g=frame.getGraphics();
g.setColor(Color.red);
g.fillOval(e.getX(), e.getY(),30, 30);
}

static public void main(String arg[])
{
    new A2();
}
}