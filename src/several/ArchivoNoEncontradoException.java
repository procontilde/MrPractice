package several;

/*
 * El mensaje de advertencia que estás recibiendo indica que la clase ArchivoNoEncontradoException debe declarar un campo serialVersionUID porque implementa la interfaz Serializable. Aunque es solo una advertencia y no un error que detenga la compilación, es una buena práctica declarar este campo en cualquier clase que extienda Exception.
 * 
 */

public class ArchivoNoEncontradoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
    public ArchivoNoEncontradoException(String message) {
    	
        super(message);
        
    }
    
}
