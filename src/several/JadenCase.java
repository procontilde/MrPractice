package several;

/*
 * CODEWARS
 */

public class JadenCase {

    public String toJadenCase(String phrase) {
       
        if (phrase == null || phrase.isEmpty()) return null;

       
        char[] miArray = phrase.toCharArray();

        if (miArray.length > 0) miArray[0] = Character.toUpperCase(miArray[0]);

        for (int i = 1; i < miArray.length; i++)
            
            if (miArray[i] == ' ' && i + 1 < miArray.length) miArray[i + 1] = Character.toUpperCase(miArray[i + 1]);

        return new String(miArray);
        
    }

    public static void main(String[] args) {
    	
        JadenCase jc = new JadenCase();
        
        String frase = "Esta es una frase para probar el funcionamiento de la clase JadenCase";
        
        System.out.println(jc.toJadenCase(frase));
        
    }
    
}

