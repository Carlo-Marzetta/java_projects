import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SwingExample
{
	JFrame frame;
	JPanel panel;
	JButton button;
	JLabel label;
	JTextArea textarea;


	public static void main(String[] args)
	{
		//new SwingExample();
	}
	
	SwingExample()
	{
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("OK");
		label = new JLabel();
		textarea = new JTextArea();
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				doSmthn(button.getLabel());
			}			
		});
		
		panel.setLayout(new BorderLayout(5, 5));
		panel.add(label, BorderLayout.NORTH);
		panel.add(textarea, BorderLayout.CENTER);
		panel.add(button, BorderLayout.SOUTH);
		frame.add(panel, BorderLayout.CENTER);
	
		frame.setSize(500, 700);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
	
	
	private void doSmthn(String msg)
	{
		label.setText(textarea.getText());
	}
}