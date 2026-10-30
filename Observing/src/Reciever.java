import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Reciever extends JFrame implements Observer
{
	static int recNumber;
	JTextArea messageOut;
	JButton btnAddObserver;
	JButton btnRemoveObserver;
	Observable theTransmitter;
	
	
	
	public Reciever(Observable tx)
	{
		theTransmitter = tx;
		init();
	}
	
	private void init()
	{
		messageOut = new JTextArea();
		btnAddObserver = new JButton("Start");
		btnRemoveObserver = new JButton("Stop");
		JPanel bodychange = new JPanel();
		
		btnRemoveObserver.setEnabled(false);
		
		setLayout(new BorderLayout(5, 5));
		bodychange.setLayout(new GridLayout(1, 5, 8, 7));
		
		bodychange.add(btnAddObserver);
		bodychange.add(btnRemoveObserver);
		
		add(bodychange, BorderLayout.SOUTH);
		add(messageOut, BorderLayout.CENTER);
		
		btnAddObserver.addActionListener(new ObserverListener());
		btnRemoveObserver.addActionListener(new ObserverListener());
		
		setSize(300, 100);
		setVisible(true);
	}
	
	private void onAdd()
	{
		theTransmitter.addObserver(this);
		btnAddObserver.setEnabled(false);
		btnRemoveObserver.setEnabled(true);
	}
	
	private void onRemove()
	{
		theTransmitter.deleteObserver(this);
		btnAddObserver.setEnabled(true);
		btnRemoveObserver.setEnabled(false);
	}

	public void update(Observable arg0, Object txt) 
	{
		System.out.println("LümmelLutscher");
		messageOut.setText(txt.toString());
	}
	
	public class ObserverListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand() == "Stop")
			{
				onRemove();
			}
			else
			{
				onAdd();
			}
			
		}
	}
}
