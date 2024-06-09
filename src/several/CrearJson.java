package several;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CrearJson {

	public static void main(String[] args) {
		
		BufferedWriter bW = null;
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Data data = new Data("Juan", 30, "Madrid");
		
		try {
			
			bW = new BufferedWriter(new FileWriter("datos.json"));
			gson.toJson(data, bW);
			
		}catch(IOException e) {
			
			e.getMessage();
			
		}finally {
			
            try {
            	
                if (bW != null) bW.close();
                
            } catch (IOException e) {
            	
                e.printStackTrace();
                
            }
            
        }
		
	}
		
	public static class Data {
		
		private String name, city;
		private int age;
		
		public Data(String name, int age, String city) {
			
			this.name = name;
			this.age = age;
			this.city = city;
			
		}
		
	}
	
}

















































