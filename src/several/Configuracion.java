package several;

/*
 * 
 * @author: MrPró
 * 
 */

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Configuracion {

	private static final String CONFIG_FILE = "config.json";

	public static void main(String[] args) {
		
		Config config = readConfig(CONFIG_FILE);
		
		if (config != null) System.out.println(config);
		
	}

	public static Config readConfig(String file) {
		
		BufferedReader bR = null;
		
		try {
			
			bR = new BufferedReader(new FileReader(file));
			Gson gson = new Gson();
			
			return gson.fromJson(bR, Config.class);
			
		} catch (IOException e) {
			
			e.getMessage();
			
		} catch (JsonSyntaxException e) {
			
			e.getMessage();
			
		} finally {
			
			if (bR != null) {
				
				try {
					
					bR.close();
					
				} catch (IOException e) {
					
					e.getMessage();
					
				}
				
			}
			
		}
		
		return null;
		
	}
	
}
