import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class Zapis {
	public static void Zapisuj()
	{
		try {      
			JSONObject pat=new JSONObject();
			FileWriter file = new FileWriter("plik.txt", true);
			BufferedWriter out = new BufferedWriter(file);
			SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat hour = new SimpleDateFormat("kk:mm:ss");
			Scanner konsola=new Scanner(System.in);
			String ciag;
			ciag=konsola.nextLine();
			
			pat.put("Data",date.format(new Date()));
			pat.put("Godzina",hour.format(new Date()));
			pat.put("Kod",ciag);
			pat.writeJSONString(out);
			out.newLine();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
