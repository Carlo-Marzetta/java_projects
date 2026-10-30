import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Vector;


public class KontaktKarte extends JFrame
{
	
	JLabel img;
	JLabel subtitle;
	JPanel centralPart;
	JPanel banner;
	JPanel contactInfo;
	JPanel person;
	JPanel personInfo;
	JPanel kontakt;
	JPanel kontaktInfo;
	JPanel rest;
	JPanel buttonPanel;
	JPanel options;

	
	
	HashMap<String, JButton> buttons;
	HashMap<String, JLabel> cL;
	HashMap<String, JTextField> cI;
	
	JCheckBox bmsBox;
	JComboBox klasseAuswahl;
	JTextArea bemerkungen;
	
	int spacing = 5;
	
	KontaktKarte()
	{
		super();
		
		centralPart = new JPanel();
		banner = new JPanel();
		contactInfo = new JPanel();
		person = new JPanel();
		personInfo = new JPanel();
		kontakt = new JPanel();
		kontaktInfo = new JPanel();
		rest = new JPanel();
		buttonPanel = new JPanel();
		options = new JPanel();
		img = new JLabel(new ImageIcon("./Logo.gif"));
		subtitle = new JLabel("Informatik/Technik");
		
		cL = new HashMap();
		cL.put("Person", new JLabel("Person :"));
		cL.put("Kontakte", new JLabel("Kontakte :"));
		cL.put("Name", new JLabel("Name"));
		cL.put("Vorname", new JLabel("Vorname"));
		cL.put("Strasse", new JLabel("Strasse"));
		cL.put("PLZ", new JLabel("PLZ"));
		cL.put("Ort", new JLabel("Ort"));
		cL.put("Tel", new JLabel("Tel"));
		cL.put("Mail", new JLabel("Mail"));
		cL.put("Klasse", new JLabel("Klasse"));
		cL.put("BMS", new JLabel("BMS"));
		cL.put("Bemerkung", new JLabel("Bemerkung"));
		
		buttons = new HashMap();
		buttons.put("New", new JButton("New"));
		buttons.put("Save", new JButton("Save"));
		buttons.put("Abort", new JButton("Abort"));
		buttons.put("Close", new JButton("Close"));
		
		cI = new HashMap();
		cI.put("Person", new JTextField());
		cI.put("Kontakte", new JTextField());
		cI.put("Name", new JTextField());
		cI.put("Vorname", new JTextField());
		cI.put("Strasse", new JTextField());
		cI.put("PLZ", new JTextField());
		cI.put("Ort", new JTextField());
		cI.put("Tel", new JTextField());
		cI.put("Mail", new JTextField());
		
		setLayout(new BorderLayout(spacing, spacing));
		centralPart.setLayout(new GridLayout(4, 1, spacing, spacing));
		banner.setLayout(new BorderLayout());
		contactInfo.setLayout(new GridLayout(1, 2, 10, 10));
		person.setLayout(new GridLayout(2, 1, spacing, spacing));
		personInfo.setLayout(new GridLayout(5, 2, spacing, spacing));
		kontakt.setLayout(new GridLayout(2, 1, spacing, spacing));
		kontaktInfo.setLayout(new GridLayout(5, 2, spacing, spacing));
		rest.setLayout(new GridLayout(2, 2, spacing, spacing));
		buttonPanel.setLayout(new GridLayout(1, 4, 0, 0));
		options.setLayout(new GridLayout(1, 3, spacing, spacing));
		
		personInfo.add(cL.get("Name"));
		personInfo.add(cI.get("Name"));
		personInfo.add(cL.get("Vorname"));
		personInfo.add(cI.get("Vorname"));
		personInfo.add(cL.get("Strasse"));
		personInfo.add(cI.get("Strasse"));
		personInfo.add(cL.get("PLZ"));
		personInfo.add(cI.get("PLZ"));
		personInfo.add(cL.get("Ort"));
		personInfo.add(cI.get("Ort"));
		
		kontaktInfo.add(cL.get("Tel"));
		kontaktInfo.add(cI.get("Tel"));
		kontaktInfo.add(cL.get("Mail"));
		kontaktInfo.add(cI.get("Mail"));
		
		kontakt.add(cL.get("Kontakte"));
		kontakt.add(kontaktInfo);
		person.add(cL.get("Person"));
		person.add(personInfo);
		
		banner.add(img, BorderLayout.EAST);
		banner.add(subtitle, BorderLayout.WEST);
		
		
		contactInfo.add(person);
		contactInfo.add(kontakt);
		
		buttonPanel.add(buttons.get("New"));
		buttonPanel.add(buttons.get("Save"));
		buttonPanel.add(buttons.get("Abort"));
		buttonPanel.add(buttons.get("Close"));
		
		add(banner, BorderLayout.NORTH);
		centralPart.add(new JSeparator());
		centralPart.add(contactInfo);
		centralPart.add(new JSeparator());
		centralPart.add(rest);
		
		add(centralPart, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		KontaktKarte k = new KontaktKarte();
	}
}
