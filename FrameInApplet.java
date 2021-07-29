import java.awt.*; 
import java.awt.event.*; 
import java.applet.*;

/*  <applet code="FrameInApplet" width=300 height=50> 
     </applet>
*/

class SampleFrame extends Frame
{ 
	SampleFrame(String title)
	{ 
		super(title);
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{ 
					setVisible(false);
				}
			}
		);
	}
	
	public void paint(Graphics g)
	{ 
		g.drawString("This is in frame window", 20, 50);
	}
}

public class FrameInApplet extends Applet
{
	Frame f;

	public void init()
	{ 
		f = new SampleFrame("A Frame Window");
		f.setSize(250, 250);
		f.setVisible(true);
	}
	
	public void start()
	{
		f.setVisible(true);
	}

	public void stop()
	{
		f.setVisible(false);
	}

	public void paint(Graphics g)
	{ 
		g.drawString("This is in applet window", 10, 20);
	}
}