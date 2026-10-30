import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserGUI extends JFrame
{
	private DefaultComboBoxModel<String> model;
	private JComboBox destination;
	
	public UserGUI(DefaultComboBoxModel<String> m)
	{
		super("Fluginformationen");
		model = m;
		init();
	}
	
	private void init()
	{
		destination = new JComboBox(model);
		
		setLayout(new BorderLayout(5, 5));
		add(new JLabel("Ihr Reiseziel: "), BorderLayout.CENTER);
		add(destination, BorderLayout.EAST);
		
		setVisible(true);
		setSize(400, 60);
	}
}
