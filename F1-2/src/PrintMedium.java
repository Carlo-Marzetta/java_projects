
public abstract class PrintMedium 
{
	String titel;
	String verlag;
	
	PrintMedium(String _titel, String _verlag)
	{
		titel = _titel;
		verlag = _verlag;
	}
	
	public String getTitel()
	{
		return titel;
	}
	
	public String getVerlag()
	{
		return verlag;
	}
	
	
	public abstract void showInfo();
	
	
	
	String addTabulator2Text(String text)
	{
		char[] _long = text.toCharArray();
		
		String tabs = "	";
		
		
		if(_long.length >= 24)
		{
			tabs = "	";
			return text += tabs;
		}
		else if (_long.length >= 16)
		{
			tabs = "		";
			return text += tabs;
		}
		else if(_long.length >= 8)
		{
			tabs = "			";
			return text += tabs;
		}
		else if(_long.length < 8)
		{
			tabs = "				";
			return text += tabs;
		}


		
		return text += tabs;
		
	}
}
