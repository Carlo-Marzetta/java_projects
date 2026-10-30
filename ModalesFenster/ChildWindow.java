import javax.swing.*;
import java.awt.*;

public class ChildWindow extends JDialog
{
	private JLabel info;
	private JTextArea parentInfo;
	
	
	ChildWindow(JFrame parent)
	{
		super(parent, "Modales Fenster", true);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
