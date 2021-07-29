import java.awt.*;

public class FlowLayoutDemo extends Frame
{
	public FlowLayoutDemo(String title)
	{
		super(title);
		
		setLayout(new FlowLayout());
	
		Button b1=new Button("Button: 1");
		Button b2=new Button("Button: 2");
		Button b3=new Button("Button: 3");
		Button b4=new Button("Button: 4");
		Button b5=new Button("Button: 5");
		Button b6=new Button("Button: 6");
		Button b7=new Button("Button: 7");
		Button b8=new Button("Button: 8");

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		
	}
	
	public static void main(String[] args)
	{
		FlowLayoutDemo screen=new FlowLayoutDemo("Flow Layout - Beginnersbook.com");
		screen.setSize(400,150);
		screen.setVisible(true);
	}
}