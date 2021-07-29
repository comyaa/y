import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/* <applet code="JScrollPaneDemo" width=300 height=200>
    </applet>
*/

public class JScrollPaneDemo extends JApplet
{
	public void init()
	{
		try
		{
			SwingUtilities.invokeAndWait(new Runnable()
			{
				public void run()
				{
					makeGUI();
				}
			});
		}
		catch(Exception e)
		{

			System.out.println("Can't create because of "+e);
		}
	}

	private void makeGUI()
	{
		//Add 400 buttons to a panel
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(20, 20));
		int b=0;
		
		for(int i=0; i<20; i++)
		{
			for(int j=0; j<20; j++)
			{
				p.add(new JButton("Button "+b));
				++b;
			}
		}

		//Create the scroll pane
		JScrollPane sp=new JScrollPane(p);
		add(sp, BorderLayout.CENTER);
	}
}