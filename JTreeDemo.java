import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.tree.*;

/* <applet code="JTreeDemo" width=400 height=200>
    </applet>
*/

public class JTreeDemo extends JApplet
{
	JTree tree;
	JLabel l;

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
		//Create top node of tree
		DefaultMutableTreeNode top=new DefaultMutableTreeNode("Options");
		
		//Create subtree of "A"
		DefaultMutableTreeNode a=new DefaultMutableTreeNode("A");
		top.add(a);
		DefaultMutableTreeNode a1=new DefaultMutableTreeNode("A1");
		a.add(a1);
		DefaultMutableTreeNode a2=new DefaultMutableTreeNode("A2");
		a.add(a2);

		//Create subtree of "B"
		DefaultMutableTreeNode b=new DefaultMutableTreeNode("B");
		top.add(b);
		DefaultMutableTreeNode b1=new DefaultMutableTreeNode("B1");
		b.add(b1);
		DefaultMutableTreeNode b2=new DefaultMutableTreeNode("B2");
		b.add(b2);

		//Create the tree
		tree=new JTree(top);

		//Add the tree to a scroll pane
		JScrollPane sp=new JScrollPane(tree);

		//Add the scroll pane to the content pane
		add(sp);

		//Add the label to the content pane
		l=new JLabel();
		add(l, BorderLayout.SOUTH);

		//Handle tree selection events
		tree.addTreeSelectionListener(new TreeSelectionListener()
		{
			public void valueChanged(TreeSelectionEvent t)
			{
				l.setText("Selection is "+t.getPath());
			}
		});
	}
}		