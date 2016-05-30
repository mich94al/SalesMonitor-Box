import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class OtworzPlik {
	public static void Tworz()  {

			FileReader plik=null;
		    try {
		      plik = new FileReader("plik.txt");
		      System.out.println("Plik istnieje-otworzono");
		     } catch (FileNotFoundException e) {
		    	 e.printStackTrace();
		         File kuba=new File("plik.txt");
		         try {
					kuba.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    }
	}
}
