package several;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 * @author: MrPró
 * 
 */

/*
 * Lee el contenido de un archivo de texto llamado "entrada.txt" y escribe el contenido en un archivo nuevo llamado "salida.txt".
 * Asegúrate de manejar las excepciones adecuadamente. Además, maneja una excepción personalizada llamada ArchivoNoEncontradoException
 * que se lanza cuando el archivo "entrada.txt" no se encuentre.
 * 
 */

public class leerContenido2 {

    public static void main(String[] args) {
    	
        try {
        	
            leerEscribirArchivo("/Users/manuelpalomo/Downloads/programacion/ejerciciosJava/archivosIO/entrada.txt",
                                "/Users/manuelpalomo/Downloads/programacion/ejerciciosJava/archivosIO/salida.txt");
            
        } catch (ArchivoNoEncontradoException e) {
        	
            e.getMessage();
            
        } catch (IOException eI) {
        	
            eI.printStackTrace();
            
        }
        
    }

    private static void leerEscribirArchivo(String archivoEntrada, String archivoSalida)
            throws ArchivoNoEncontradoException, IOException {

        File file = new File(archivoEntrada);
        
        if (!file.exists()) throw new ArchivoNoEncontradoException("El archivo " + archivoEntrada + " no se encuentra.");

        BufferedReader bR = null;
        BufferedWriter bW = null;

        try {
        	
            bR = new BufferedReader(new FileReader(archivoEntrada));
            bW = new BufferedWriter(new FileWriter(archivoSalida));
            String linea;

            while ((linea = bR.readLine()) != null) {
            	
                bW.write(linea);
                bW.newLine();
                
            }

            bW.flush();

        } catch (IOException e) {
        	
            e.printStackTrace();
            
        } finally {
        	
            try {
            	
                if (bW != null) bW.close();
                if (bR != null) bR.close();
                
            } catch (IOException iE) {
            	
                iE.printStackTrace();
                
            }
            
        }

        System.out.println("El archivo se ha copiado con éxito.");
        
    }
    
}
