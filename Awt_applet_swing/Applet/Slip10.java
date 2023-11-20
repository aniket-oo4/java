import java.applet.Applet;
import java.awt.*;


public class Slip10 extends Applet {
    
public void paint(Graphics g)
{
    setBackground(Color.DARK_GRAY);
    g.drawRect(100,150,90,120);
    g.drawRect(130,230,20,40);
    g.drawLine(150,100,100, 150);
    g.drawLine(150,100,190, 150);
    g.drawLine(150,50,20, 20);

}

}
