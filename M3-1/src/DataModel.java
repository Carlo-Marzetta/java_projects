/**
 * Die Klasse DataModel stellt eine Menge von Obejkten einer Datenklasse (hier DataClass) bereit.
 * Die Objekte sind typischwerweise in einer Collection abgelegt.
 * 
 * Für die Ausgabe werden die Werte der Daten-Objekte so aufbereitet, dass über den MVC-Mecano von Swing
 * eine JTable bedient wird.
 * Dazu muss diese Klasse das Interface TableModel implementieren. Das wird garantiert, in dem von 
 * DefaultTableModel (Komfortklasse) geerbt wird.
 * Um die Tabelle zu beschriften, werden in einem String-Array die Überschriften festgehalten.
 * 
 * @author René Probst
 *
 */
import java.util.*;

import javax.swing.table.*;

public class DataModel extends AbstractTableModel{
	
	
	Vector<DataClass> dataVector;
	
	 final String[] title;
	
	DataModel()
	{
		title = new String[] {"Hersteller", "Hubraum", "Leistung"};
		dataVector = new Vector<DataClass>();
		addRow(new DataClass("VW", 30f, 30));
		addRow(new DataClass("BMW", 500f, 900));
		addRow(new DataClass("Rimac", 0f, 10000));
	}
	
	public int getColumnCount()
	{
		return 3;
	}
	
	public int getRowCount()
	{
		return dataVector.size();
	}
	
	public String getColumnName(int column)
	{
		return title[column];
	}
	
	public Object getValueAt(int rowIndex, int columnIndex)
	{
		switch(columnIndex)
		{
		case 0:
			return dataVector.get(rowIndex).getHersteller();
			
		case 1:
			return dataVector.get(rowIndex).getHubraum();
			
		case 2:
			return dataVector.get(rowIndex).getLeistung();
			
		default:
			return null;
		}
	}
	
	public boolean isCellEditable(int rowIndex, int columnIndex)
	{
		if(columnIndex > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void setValueAt(Object aValue, int rowIndex, int columnIndex)
	{
		switch(columnIndex)
		{
		case 1:
			float f = Float.parseFloat(aValue.toString());
			dataVector.get(rowIndex).setHubraum(f);
			break;
			
		case 2:
			int lol = Integer.parseInt(aValue.toString());
			dataVector.get(rowIndex).setLeistung(lol);
			break;
		}
	}

	
	
	public void addRow(DataClass object)
	{
		dataVector.add(object);
		fireTableDataChanged();
	}
  
  // Hier die benötigten Attribute festlegen
  
  //Konstruktor 
  
  // Ab hier implementieren Sie bitte ALLE nötigen Schnittstellenfunktionen für das Datenmodell!
  
  
  // und hier fügen Sie eine weitere Methdoe zu, die ein neues Objekt 
  // der Klasse DataClass dem Vector zufügt und in der Tabelle zur
  // Anzeige bringt.
   

}