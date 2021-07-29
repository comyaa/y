import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class Menu
{
	JMenu menu, submenu;
	JMenuItem i1, i2, i3, i4, i5;
	
	Menu()
	{
		JFrame f=new JFrame("Menu and MenuItem Example");
		JMenuBar mb=new JMenuBar();
		menu=new JMenu("Menu");
		submenu=new JMenu("Sub Menu");
	
		i1=new JMenuItem("New");
		i2=new JMenuItem("Open");
		i3=new JMenuItem("Save As");
		i4=new JMenuItem("File Open");
		i5=new JMenuItem("Exit");

		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);
		submenu.add(i5);

		menu.add(submenu);
		mb.add(menu);
	
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Menu();
	}
}				