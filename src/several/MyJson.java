package several;

import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class MyJson {
	
	private static enum hobbies { CINE, TEATRO, MÚSICA, CONCIERTOS,  MUSEOS, DEPORTES, ACAMPADA, SENDERISMO, OTROS}
	private static enum tags { RUBIA, MORENA, PELIRROJA, CURVI, DELGADA, DEPORTISTA, NETFLIX, PLAYA, TERRAZAS, QUEDADAS, MANIS }
	private static enum ages { JOVEN, TREINTAS, CUARENTAS, CINCUENTAS, SESENTAS, VIEJO }
	private static hobbies tipoHob1, tipoHob2, tipoHob3;
	private static tags tipoTag1, tipoTag2, tipoTag3;
	private static ages tipoAge;

	public static void main(String[] args) {
		
		Scanner miScan = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String name = miScan.nextLine();
		
		System.out.println("Edad: ");
		String age = miScan.nextLine();
		
		System.out.println("Trabajo: ");
		String job = miScan.nextLine();
		
		tipoHob1 = hobbies.CINE;
		tipoHob2 = hobbies.CONCIERTOS;
		tipoHob3 = hobbies.TEATRO;
		
		tipoTag1 = tags.CURVI;
		tipoTag2 = tags.DELGADA;
		tipoTag3 = tags.DEPORTISTA;
		
		System.out.println(createJson(name, age, job, tipoHob1, tipoHob2, tipoHob3, tipoTag1, tipoTag2, tipoTag3));

		miScan.close();
		
	}
	
	private static String createJson(String name, String age, String job, hobbies tipoHob1, hobbies tipoHob2, hobbies tipoHob3, tags tipoTag1, tags tipoTag2, tags tipoTag3) {
		
		JsonObject jO = new JsonObject();
		jO.addProperty("nombre", name);
		jO.addProperty("Edad", age);
		jO.addProperty("Trabajo", job);
		
		JsonArray jA = new JsonArray();
		jA.add(tipoHob1.toString());
		jA.add(tipoHob2.toString());
		jA.add(tipoHob3.toString());
		jO.add("Aficciones", jA);
		
		JsonArray jAr = new JsonArray();
		jAr.add(tipoTag1.toString());
		jAr.add(tipoTag2.toString());
		jAr.add(tipoTag3.toString());
		jO.add("Preferencias", jAr);
		
		String st = jO.toString();
		
		return st;
		
	}

}
