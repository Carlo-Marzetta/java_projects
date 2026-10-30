import javax.swing.*;


public class TabbedPane extends JFrame
{
	
	JTabbedPane tP;
	
	
	TabbedPane()
	{
		tP = new JTabbedPane();
		tP.addTab("Erster Tab", new JLabel("Hello World"));
		tP.addTab("Jalolne", new JLabel("./logo.gif"));
		add(tP);
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new TabbedPane();
	}
}
