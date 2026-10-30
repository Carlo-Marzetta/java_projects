
public class Rechner 
{
  public static void main(String[] args) 
  {

    MathOp rechner = null;
    
    MyReader reader;
    reader = MyReader.getInstance();
    
    Tokenizer token;
    token = new Tokenizer();
    
    String rechnung;
    
    token.split(reader.getString("Rechnung:"));
    
    char op;
    op = token.getOperation();
    
    switch(op)
    {
    case '+':
    	rechner = new Addierer();
    	break;
    case '-':
    	rechner = new Subtrahierer();
    	break;
    case '*':
    	rechner = new Multiplizierer();
    	break;
    case '/':
    	rechner = new Dividierer();
    	break;
    case '^':
    	rechner = new Exponierer();
    	break;
    }
    
    try
    {
    	rechner.execOp(token.getValue1(), token.getValue2());
    	rechner.printResult();
    }
    catch(NullPointerException ex)
    {
    	System.out.print("Ungültige Operation");
    }
  }



}
