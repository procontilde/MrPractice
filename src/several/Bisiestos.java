package several;

/*
 * 
 * @author: MrPró
 * 
 */

import java.util.Scanner;

public class Bisiestos {

	private static final String MESS1 = "El año no es bisiesto";
	private static final String MESS2 = "El año es bisiesto";

	public static void main(String[] args) {

		Scanner miScan = new Scanner(System.in);

		try {

			System.out.println("Año: ");
			String s = miScan.nextLine();

			boolean esBisiesto = guessLeapYear(s);

			if (esBisiesto) System.out.println(MESS2);
				else System.out.println(MESS1);

		} catch (Exception e) {

			System.out.println("Mensaje: " + e.getMessage());

		} finally {
			
			if (miScan != null) miScan.close();
			
		}

	}

	private static boolean guessLeapYear(String year) {
        
        int iYear = Integer.parseInt(year);  
        
        if (iYear % 4 == 0) {
        	
            if (iYear % 100 == 0) {
            	
                if (iYear % 400 == 0) {
                	
                    return true;
                    
                } else {
                	
                    return false; 
                    
                }
                
            } else {
            	
                return true;
                
            }
            
        } else {
        	
            return false; 
            
        }
        
	}

}





















