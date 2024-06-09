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
 * Lee el contenido de un archivo de texto llamado "entrada.txt" y escribe el contenido en un archivo nuevo llamado "salida.txt". Asegúrate de manejar las excepciones adecuadamente.
 * 
 */

public class leerContenido {

	public static void main(String[] args) {
		
		leerEscribirArchivo("/Users/manuelpalomo/Downloads/programacion/ejerciciosJava/archivosIO/entrada.txt", "/Users/manuelpalomo/Downloads/programacion/ejerciciosJava/archivosIO/salida.txt");
		
		

	}
	
	private static void leerEscribirArchivo(String archivo, String archivoCopia) {
		
		BufferedReader bR = null;
		BufferedWriter bW = null;
		
		try {
			
			bR = new BufferedReader(new FileReader(archivo));
			bW = new BufferedWriter(new FileWriter(archivoCopia));
			String linea;
			
			while((linea = bR.readLine()) != null) {
				
				bW.write(linea);
				bW.newLine();
				
			}
			
			bW.flush();
			bW.close();
			bW = null;
			bR.close();
			bR = null;
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}finally {
			
			try {
				
				if(bW != null) bW.close();
				if(bR != null) bR.close();
				
			}catch(IOException iE) {
				
				iE.printStackTrace();
				
			}
			
		}
		
		System.out.println("Bien");
		
	}

}
