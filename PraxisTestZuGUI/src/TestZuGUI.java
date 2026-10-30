import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestZuGUI extends JFrame
{
	JButton m_Enter;
	JButton m_Abort;
	JPanel m_ButtonHolder;
	JTextField m_Text;
	
	
	public static void main(String[] args)
	{
		TestZuGUI t = new TestZuGUI();
	}
	
	TestZuGUI()
	{
		super();
		setSize(225, 90);
		setTitle("Test zu GUI-Werkstatt");
		
		m_Enter = new JButton("Enter");
		m_Enter.addActionListener(new EnterListener());
		
		m_Abort = new JButton("Abort");
		m_Abort.addActionListener(new AbortListener());
		
		m_ButtonHolder = new JPanel();
		m_ButtonHolder.setLayout(new GridLayout(1, 2, 0, 0));
		m_ButtonHolder.add(m_Enter);
		m_ButtonHolder.add(m_Abort);
		
		m_Text = new JTextField("Text der ausgegeben wird");
		
		setLayout(new GridLayout(2, 1, 0, 0));
		getContentPane().add(m_Text);
		getContentPane().add(m_ButtonHolder);

		
		
		
		setVisible(true);
	}
	
	
	
	public class EnterListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			m_Enter.setEnabled(false);
			System.out.print(m_Text.getText());
		}
	}
	
	public class AbortListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			m_Text.setText("");
			m_Enter.setEnabled(true);
		}
	}
}


