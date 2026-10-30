
import java.util.*;

public class Hashes 
{
	public static void main(String[] args)
	{
	
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Jeff", "verstorben");
		map.put("Heinz", "am leben");
		map.put("Gunter", "verstorben");
		map.put("Franz", "unbekannt");
		
		
		map.remove("Gunter");
		
		for(Map.Entry<String, String> e : map.entrySet())
		{
			System.out.println(e);
		}
	}
	
}