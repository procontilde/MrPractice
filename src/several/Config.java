package several;

import com.google.gson.Gson;

/*
 * 
 * @author: MrPró
 * 
 */

/*
 * 
 * Crea una clase de configuración que lea un archivo JSON llamado "config.json" y almacene la configuración en un objeto Java. Usa la librería Jackson o Gson. Maneja las excepciones de manera adecuada para archivos mal formados.
 * 
 */


public class Config {
	
    private String servidor;
    private int puerto;
    private String usuario;
    private String contraseña;

    public String getServidor() { return servidor; }
    public int getPuerto() { return puerto; }
    public String getUsuario() { return usuario; }
    public String getContraseña() { return contraseña; }
    
    public void setServidor(String servidor) { this.servidor = servidor; }
    public void setPuerto(int puerto) { this.puerto = puerto; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    @Override
    public String toString() {
    	
        return "CONFIG:\n\n" 
        	+ "Servidor: '" + servidor + "\n" 
		+ "Puerto: " + puerto + "\n"
		+ "Usuario: " + usuario + "\n" 
		+ "Contraseña: " + contraseña;
        
    }
    
}

























































