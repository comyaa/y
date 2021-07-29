import java.awt.*;
import java.applet.*;

/* <applet code="GridLayoutDemo" width=300 height=200>
    </applet> 
*/

public class GridLayoutDemo extends Applet
{ 
	static final int n = 4;
	Button[] bArray=new Button[16];
	
	public void init()
	{
		setLayout(new GridLayout(n, n));
		setFont(new Font("SansSerif", Font.BOLD, 24));
	
		for(int i = 0; i <bArray.length-1; i++)
		{
			bArray[i]=new Button(i+1+"");
			add(bArray[i]);
		}

		bArray[bArray.length-1]=new Button();
		add(bArray[bArray.length-1]);
	}
}