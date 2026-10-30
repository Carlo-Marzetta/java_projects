import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class View extends JFrame
{

		DefaultListModel model;
		JList viewComponent;
		JButton btn;
		JTextField inputValue;
		
	  
	  
	  /**
	  * Konstruktor
	  */
	  public View(DefaultListModel<String> m){
	    super("View-Komponente");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    model = m;

	    init();
	    
	    pack();
	    setVisible(true);
	  }
	  
	  
	  private void init()
	  {
		  viewComponent = new JList<String>(model);
		  setLayout(new BorderLayout(10, 10));
		  JScrollPane pane = new JScrollPane(viewComponent);
		  add(pane, BorderLayout.CENTER);
		  
		  btn = new JButton("Add Item");
		  add(btn, BorderLayout.SOUTH);
		  btn.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {onAddItem();}});
	    
		  inputValue = new JTextField();
		  add(inputValue, BorderLayout.NORTH);
		  inputValue.setVisible(false);
		  inputValue.addKeyListener(new KeyAdapter() {public void keyTyped(KeyEvent e) {onEnter(e); }});
		  pack();
		  setVisible(true);
	  }
	  

	  private void onAddItem(){
	    inputValue.setVisible(true);
	    pack();
	    this.repaint();
	    inputValue.requestFocus();
	  }
	  

	  private void onEnter(KeyEvent event){
	    if (event.getKeyChar() == KeyEvent.VK_ENTER){
	      inputValue.setVisible(false);
	      pack();
	      this.repaint();
	      model.addElement(inputValue.getText());
	      inputValue.setText("");
	      viewComponent.requestFocus();
	    }
	  }
	  

	  public static void main(String[] args){
	    Model m = new Model();
	    View v = new View(m);
	    
	  }
	}

