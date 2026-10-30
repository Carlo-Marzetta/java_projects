import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputGUI extends JFrame
{
	private DefaultComboBoxModel<String> model;
	private JTextField destinationInput;
	private JButton addButton;
	
	
	public InputGUI(DefaultComboBoxModel<String> m)
	{
		super("Administration - FlyTop");
		model = m;
		init();
	}
	
	private void init()
	{

		JPanel p = new JPanel();
		destinationInput = new JTextField();
		addButton = new JButton("zufügen");
		
		p.setLayout(new GridLayout(1, 2, 5, 5));
		
		p.add(new JLabel("Destination:"));
		p.add(destinationInput);

		add(p, BorderLayout.NORTH);
		add(addButton, BorderLayout.SOUTH);
		
		destinationInput.requestFocus();		
		this.addAction();
		
		pack();
		setSize(400, 90);
		setVisible(true);
	}


	private void addAction()
	{
		addButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				onClick();
			}
			
		});
	}
	
	private void onClick()
	{
		model.addElement(destinationInput.getText());
		destinationInput.setText(null);
		destinationInput.requestFocus();
		model.toString();
	}
}
