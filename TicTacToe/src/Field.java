import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Field extends JButton
{
	
	Frame frame;
	
	
	Field(Frame f)
	{
		frame = f;
		
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				updateContent();
			}
		});
	}
	

	public void updateContent()
	{
		this.setText(frame.getCurrentPlayer());
		this.removeActionListener(this.getActionListeners()[0]);
	}
	
	
	

}