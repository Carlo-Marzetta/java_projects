import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputView extends JFrame
{
	JTextField inputField;
	JTextArea info;
	IntegerModel model;
	
	public InputView(IntegerModel m)
	{
		model = m;
		init();
	}
	
	public String getText()
	{
		String txt = inputField.getText();
		inputField.setText("");
		return txt;
	}
	
	public JTextField getInputField()
	{
		return inputField;
	}
	
	/**
	 * 
	 */
	private void init()	
	{
		inputField = new JTextField();
		inputField.addKeyListener(new InputController(this, model));
		info = new JTextArea("Geben Sie hier eine Zahl ein. Sie wird in den Ausgabefenstern in Hex, Bin und Dec ausgegeben. \nBestätigen Sie die Eingabe mit ENTER.");
		info.setEditable(false);
		info.setLineWrap(true);
		setLayout(new BorderLayout(5, 5));
		add(info, BorderLayout.CENTER);
		add(inputField, BorderLayout.SOUTH);
		
		setSize(300, 100);
		setVisible(true);
	}
}
