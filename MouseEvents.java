import java .awt.*;
import java .awt.event. *;
import java.applet.*;

// <applet code="MouseEvents" width=300 height=100>
// </applet>

public class MouseEvents extends Applet implements MouseListener , MouseMotionListener
{
	String msg= "";
	int mouseX=0,mouseY=0;

	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void mouseClicked(MouseEvent me)
	{
		mouseX=0;
		mouseY=10;
		msg="MouseClicked";
		repaint();
	}
	
	public void mouseEntered(MouseEvent me)
	{
		mouseX=0;
		mouseY=10;
		msg="MouseEntered";
		repaint();
	}
	
	public void mouseExited(MouseEvent me)
	{
		mouseX=0;
		mouseY=10;
		msg="MouseExited";
		repaint();
	}
	
	public void mousePressed(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="Down" ;
		repaint();
	}

	public void mouseReleased(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="Up";
		repaint();
	}
	
	public void mouseDragged(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg= "*";
		showStatus("Drawing mouse at"+mouseX+","+mouseY);
		repaint();
	}
	
	public void mouseMoved(MouseEvent me)
	{
		showStatus("Drawing mouse at"+me.getX()+","+me.getY());
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,mouseX,mouseY); 
	}
}