import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="CardLayoutDemo1" width=300 height=100> 
    </applet> 
*/

public class CardLayoutDemo1 extends Applet implements ActionListener
{
	Checkbox winXP, winVista,winNT,win7;
	Button solaris, mac,android,Fedora;
	Panel osCards;
	CardLayout cardLO;
	Button Win, Other;

	public void init()
	{
		Win = new Button("Windows");
		Other = new Button("Other");
		add(Win);
		add(Other);
		
		cardLO = new CardLayout();
		osCards = new Panel();
		osCards.setLayout(cardLO);    // set panel layout to card layout
		
		winXP = new Checkbox("Windows XP", null, true);
		winVista = new Checkbox("Windows Vista");
		winNT = new Checkbox("Windows NT");
		win7 = new Checkbox("Windows7");
		
		solaris = new Button("Solaris");
		mac = new Button("Mac OS");
		android = new Button("Android");
		Fedora = new Button("Fedora");

		// add Windows check boxes to a panel
		Panel winPan = new Panel();
		winPan.setLayout(new GridLayout(2,2));
		winPan.add(winXP);
		winPan.add(winVista);
		winPan.add(winNT);
		winPan.add(win7);

		// add other OS check boxes to a panel
		Panel otherPan = new Panel();
		otherPan.setLayout(new BorderLayout());
		otherPan.add(solaris,BorderLayout.NORTH);
		otherPan.add(mac,BorderLayout.SOUTH);
		otherPan.add(android,BorderLayout.EAST);
		otherPan.add(Fedora,BorderLayout.WEST);

		// add panels to card deck panel
		osCards.add(winPan, "Windows");
		osCards.add(otherPan, "Other");

		// add cards to main applet panel
		add(osCards);
		
		// register to receive action events
		Win.addActionListener(this);
		Other.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == Win)
			cardLO.show(osCards, "Windows");
		else
			cardLO.show(osCards, "Other");
	}
}