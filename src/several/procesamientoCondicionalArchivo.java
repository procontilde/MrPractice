package several;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 * @author: MrPró
 * 
 */

/*
 * Lee el archivo "datos.txt". Si el archivo contiene la palabra "ERROR", escribe esa línea en un archivo llamado "errores.txt". Si no, escribe la línea en un archivo llamado "procesados.txt".
 * 
 */

public class procesamientoCondicionalArchivo {
	
	private static final String error = "ERROR";

	public static void main(String[] args) {
		
		process("/Users/manuelpalomo/Downloads/programacion/ejerciciosJava/archivosIO/salida.txt",
				"/Users/manuelpalomo/Downloads/programacion/ejerciciosJava/archivosIO/errores.txt",
				"/Users/manuelpalomo/Downloads/programacion/ejerciciosJava/archivosIO/procesados.txt");
		
	}
	
	private static void process(String datos, String errores, String procesados) {
		
		BufferedReader bR = null;
		BufferedWriter bW = null;
		BufferedWriter bW2 = null;
		
		try {
			
			bR = new BufferedReader(new FileReader(datos));
			bW = new BufferedWriter(new FileWriter(procesados));
			bW2 = new BufferedWriter(new FileWriter(errores));
			String linea;
			
			while((linea = bR.readLine()) != null) {
				
				if(linea.contains(error)) {
					
					
					bW2.write(linea);
					bW2.newLine();
					
					
				}else {
					
					bW.write(linea);
					bW.newLine();
					
				}
				
			}
			
			bW.flush();
			bW2.flush(); 
			bW.close();
			bW2.close();
			bW = null;
			bW2 = null;
			
			
		}catch(IOException i) {
			
			i.printStackTrace();
			
		}finally {
			
			try {
			
			if(bR != null) bR.close();
			if(bW != null) bW.close();
			if(bW2 != null) bW2.close();
			
			}catch(IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}

}















































