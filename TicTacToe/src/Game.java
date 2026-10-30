import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Game extends JPanel
{
	Frame frame;
	ArrayList<Field> fields;
	
	Game(Frame f)
	{
		fields = new ArrayList<Field>();
		frame = f;
		this.setLayout(new GridLayout(3, 3));
		for(int i = 0; i < 9; i++)
		{
			Field fi = new Field(f);
			this.add(fi);
			fields.add(fi);
		}
	}
}
