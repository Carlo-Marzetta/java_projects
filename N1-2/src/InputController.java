import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class InputController extends KeyAdapter
{
	InputView view;
	IntegerModel model;
	
	
	public InputController(InputView v, IntegerModel m)
	{
		model = m;
		view = v;
	}
	
	public void keyTyped(KeyEvent e)
	{
		try
		{
			if(e.getKeyChar() == KeyEvent.VK_ENTER)
			{
				System.out.println("ENTER PRESSED");
				model.setValue(Integer.parseInt(view.getText()));
			}
			System.out.println("Key was pressed");
		}
		catch(InputMismatchException ex)
		{
			JOptionPane.showMessageDialog(view, "Ungültige Zahl eingegeben" ,"Error", JOptionPane.ERROR_MESSAGE);
			System.out.println("ERROR");
		}
	}
}
