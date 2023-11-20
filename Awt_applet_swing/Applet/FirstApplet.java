// package Awt_applet_swing;

import java.applet.*;
import java.awt.*;
/* <applet code="FirstApplet.class" height="500" width="500">
 </applet>
 */
public class FirstApplet extends Applet{
	String msg="";
	public void init()
	{
		msg="Int init method ";
		System.out.println(msg);
		
	}
	public void start () {
		msg ="in the start method ";
		System.out.println(msg);
	}
	public void stop()
	{
		msg="int the stop method ";
		System.out.println(msg);
		
	}
	public void destroy ()
	{
		msg="int the destroy method ";
		System.out.println(msg);
		
	}
	public void paint(Graphics g) {
		g.drawString(msg, 200, 200);
	}
	
	
	
}

