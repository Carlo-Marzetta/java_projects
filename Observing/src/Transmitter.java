import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Transmitter extends Observable
{
	JTextField theMessage;
	JFrame theWindow;
	JButton btnSend;
	
	public Transmitter()
	{
		init();
	}
	
	private void init()
	{
		theWindow = new JFrame();
		theMessage = new JTextField();
		btnSend = new JButton("Send");
		btnSend.addActionListener(new ButtonListener());
		theWindow.setLayout(new BorderLayout(5, 5));
		theWindow.add(theMessage, BorderLayout.CENTER);
		theWindow.add(btnSend, BorderLayout.SOUTH);
		theWindow.setTitle("The Window");
		theWindow.setSize(300, 100);
		theWindow.setVisible(true);
	}
	
	private void doSend()
	{
		setChanged();
		notifyObservers(theMessage.getText());
		theMessage.setText("");
	}
	
	public static void main(String[] args)
	{
		Transmitter tx = new Transmitter();
		
		Reciever rx1 = new Reciever(tx);
		
		Reciever rx2 = new Reciever(tx);
	}
	
	
	public class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			doSend();
		}
		
	}
}
