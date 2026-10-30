import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

public class MarcsProgramm
{

    static Scanner scanner;

    public static void main(String[] args) 
    {
        MarcsProgramm program = new MarcsProgramm();
        program.run();
    }

    private void run() 
    {
         Scanner in = new Scanner(System.in);
         
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        double[] munz = { 5, 2, 1, 0.5, 0.2, 0.1, 0.05};
        
        double[] noten = { 1000, 200, 100, 50, 20, 10};
        
        double betrag;
        
        System.out.print("Betrag: ");
        
        betrag=in.nextDouble();
        

        while(betrag>10) 
        {
	        for (double i : noten) 
	        {
	            if (betrag>i) 
	            {
	                betrag=betrag-i;
	            }
	        }
	    }
        while(betrag>0) 
        {
            for (double i : munz) 
            {
                if (betrag>i) 
                {
                    betrag=betrag-i;
                }
            }
        }
            System.out.println("Der Betrag lautet: "+betrag);
    }
}