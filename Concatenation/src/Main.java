import java.util.Arrays;

public class Main 
{
	public static void main(String[] args)
	{
		Main m = new Main();
		String declarations = "var foo = 'foo';" +
		"var bar = 'bar';" +
		"var bar = 'bar';" +
		"var baz = 'baz';";


		String s0 = "var str0 = 1234;";
		String s1 = "var str1 = 'hello ' + 'foo bar \"baz\" qux';";
		String s2 = "var str2 = 'hello' + foo + ' ' + bar + \" \" + qux;";
		String s3 = "var str3 = foo + \" \" + bar + ', ' + qux + '.',";
		String s4 = "var str4 = bar + \"bar\" + qux + '.' + 20;";
		String s5 = "var str0 = foo;";
		
		System.out.println("str0: " + m.isJavaScriptConcatenation(s0));
		System.out.println("str1: " + m.isJavaScriptConcatenation(s1));
		System.out.println("str2: " + m.isJavaScriptConcatenation(s2));
		System.out.println("str3: " + m.isJavaScriptConcatenation(s3));
		System.out.println("str4: " + m.isJavaScriptConcatenation(s4));
		System.out.println("str5: " + m.isJavaScriptConcatenation(s5));
		
		System.out.println(m.convertJavaScriptConcatenationToTypeScriptInterpolation(s0));
		System.out.println(m.convertJavaScriptConcatenationToTypeScriptInterpolation(s1));
		System.out.println(m.convertJavaScriptConcatenationToTypeScriptInterpolation(s2));
		System.out.println(m.convertJavaScriptConcatenationToTypeScriptInterpolation(s3));
		System.out.println(m.convertJavaScriptConcatenationToTypeScriptInterpolation(s4));
		System.out.println(m.convertJavaScriptConcatenationToTypeScriptInterpolation(s5));

	}
	
	private boolean isJavaScriptConcatenation(String string)
	{
		string = string.replaceAll(",", "");
		string = string.replaceAll(";", "");
		
		String rmDeclaration = string.split("= ")[1];
		String[] additions = rmDeclaration.split("\\+");

		for(String s : additions)
		{		
			if(isJSVariable(s))
			{
				return true;
			}
		}
		return false;	
	}
	
	
	/*
	 * converts a JavaScript Concatenation into a TypeScript Interpolation
	 * 
	 */
	private String convertJavaScriptConcatenationToTypeScriptInterpolation(String string)
	{
		if(!isJavaScriptConcatenation(string))
		{
			return string;
		}
		
		String result = "";
		
		String[] splitDeclaration = string.split("= ");
		result += splitDeclaration[0] + "= `";
		
		splitDeclaration[1] = splitDeclaration[1].replace(" + ", "+");
		splitDeclaration[1] = splitDeclaration[1].substring(0, splitDeclaration[1].length() - 1);
		String[] additions = splitDeclaration[1].split("\\+");
		//System.out.println(Arrays.toString(additions));
		
		for(int i = 0; i < additions.length; i++)
		{
			if(isJSVariable(additions[i]))
			{
				//Remove Symbols
				additions[i] = additions[i].replace(" ", "");
				additions[i] = additions[i].replace(",", "");
				additions[i] = additions[i].replace(".", "");
				
				//Add the variable stuff
				additions[i] = "${" + additions[i] + "}";
			}
			result += additions[i];
		}
		
		//convert from JS to TS
		result = result.replace("\"", "");
		result = result.replace("'", "");
		result = result.replace("\\+", "");
		
		result += "`;";
		return result;
	}
	
	
	/*
	 * Work in progresss
	 * Doesn't recognize strings
	 */
	private String convertJavaScriptConcatenationToTypeScriptInterpolation2(String string)
	{
		
		if(!isJavaScriptConcatenation(string))
		{
			return string;
		}
		
		String result = "";
		String[] splitDeclaration = string.split("= ");
		result += splitDeclaration[0] + "= `";
		
		char[] ca = splitDeclaration[1].toCharArray();
		boolean inVar = false;
		
		for(int i = 0; i < ca.length; i++)
		{
			boolean inString = false;
			
			
			//This isn't working
			if(ca[i] == '\"' || ca[i] == '\'')
			{
				inString = !inString;
			}
			else
			{
				if(inString)
				{
					result += ca[i];
				}
				else
				{
					switch(ca[i])
					{
					case ' ':
						if(inVar)
						{
							result += "}";
							inVar = false;
						}
						break;
					case '+':
						if(inVar)
						{
							result += "}";
							inVar = false;
						}
						break;
					case ';':
						if(inVar)
						{
							result += "}";
							inVar = false;
						}
						break;
					case ',':
						if(inVar)
						{
							result += "}";
							inVar = false;
						}
						break;
					default:
						if(inVar)
						{
							result += ca[i];
						}
						else
						{
							result += "${" + ca[i];
							inVar = true;
						}
					}
				}
			}
		}
		
		
		return result;
	}
	
	
	/*
	 * returns true or false whether the given String is a JavaScript variable
	 */
	private boolean isJSVariable(String s)
	{
		s = s.replace(";", "");
		if(!s.contains("\""))
		{
			if(!s.contains("'"))
			{
				
				//Checks for numbers
				try
				{
					double testForNum = Double.parseDouble(s);
				}
				catch(NumberFormatException e)
				{
						return true;
				}
			}
		}
		return false;
	}
}
