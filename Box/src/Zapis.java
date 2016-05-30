import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zapis {
	public static void Zapisuj()
	{
		try {
			FileWriter file = new FileWriter("plik.txt", true);
			Scanner kuba=new Scanner(System.in);
			out=kuba.nextLine();
			
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
