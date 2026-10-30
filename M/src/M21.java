import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class M21 extends JFrame
{
	
	JButton left;
	JButton right;
	JTextArea txt;
	JTextField inpt;
	JList<String> lstd;
	String[] lollipops;
	JScrollPane sp;
	JScrollBar sb;
	
	boolean cyan;
	Color clr;
	
	public static void main(String[] args)
	{
		new M21();
	}
	
	M21()
	{
		setLayout(new BorderLayout(5, 5)); 
		JPanel top = new JPanel();
		JPanel bottom = new JPanel();
		
		
		
		txt = new JTextArea();
		txt.addFocusListener(new FocalListener());
		
		sp = new JScrollPane(txt);
		
		inpt = new JTextField();
		inpt.addKeyListener(new InputListener());
		
		lollipops = new String[] {"Hallo", "Meh", "Pudelschokolade", "Endoplasmatisches Retikulum", "Roter Knopf"};
		lstd = new JList<String>(lollipops);
		lstd.addListSelectionListener(new ListListListener());
		
		
		left = new JButton("ToGgLe CoLoR");
		left.setBackground(Color.CYAN);
		left.addActionListener(new LOLListener());
		cyan = true;
		
		
		right = new JButton("B2");
		right.addMouseListener(new MousalListener());
		clr = right.getBackground();
		
		
		top.setLayout(new GridLayout(1, 3));
		bottom.setLayout(new BorderLayout(5, 5));
		
		top.add(new JLabel("MEh"));
		
		top.add(inpt);
		
		bottom.add(left, BorderLayout.WEST);
		bottom.add(right, BorderLayout.EAST);
		
		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.SOUTH);
		add(sp, BorderLayout.CENTER);
		add(lstd, BorderLayout.EAST);
		
		

		setSize(400, 200);
		setVisible(true);
	}
	
	
	
	
	public class LOLListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			switch(e.getActionCommand())
			{
			case "ToGgLe CoLoR":
				changeColor();
				break;
				
			case "":
				break;
				
			default:
				break;
			}
		}
		
		void changeColor()
		{
			if(cyan == false)
			{
				cyan = true;
				left.setBackground(Color.CYAN);
			}
			else
			{
				cyan = false;
				left.setBackground(Color.GREEN);
			}
		}
	}
	
	
	public class FocalListener implements FocusListener
	{
		public void focusGained(FocusEvent e)
		{
			System.out.println("FoCuS gAiNeD");
		}
		public void focusLost(FocusEvent e)
		{
			System.out.println("fOcUs LoSt");
		}
	}
	
	public class ListListListener implements ListSelectionListener
	{

		public void valueChanged(ListSelectionEvent lse) 
		{
			System.out.println(lstd.getSelectedIndex());
		}
		
	}
	
	
	public class MousalListener extends MouseAdapter
	{
		public void mouseEntered(MouseEvent e)
		{
			right.setBackground(Color.WHITE);
		}
		
		public void mouseExited(MouseEvent e)
		{
			right.setBackground(clr);
		}
		
	}
	
	
	public class InputListener implements KeyListener
	{

		public void keyPressed(KeyEvent e) 
		{
			if(e.getKeyCode() == KeyEvent.VK_ENTER)
			{
				txt.append(inpt.getText() + "\n");
				inpt.setText("");
			}
		}

		@Override
		public void keyReleased(KeyEvent e) 
		{

			
		}

		public void keyTyped(KeyEvent e) {
			
			
		}
		
	}
}
