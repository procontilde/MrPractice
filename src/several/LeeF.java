package several;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeeF {

	public static void main(String[] args) {
		
		Scanner miScan = new Scanner(System.in);
		
		System.out.println("Path: ");
		String path = miScan.nextLine();
		String result = readFile(path);
		System.out.println(result);
		
		miScan.close();
		
	}
	
	private static String readFile(String path) {
		
		BufferedReader bR = null;
		StringBuilder sB = new StringBuilder();
		String text = "";
		
		try {
			
			bR = new BufferedReader(new FileReader(path));
			String line;
			
			while((line = bR.readLine()) != null) sB.append(line).append("\n");
			
			bR.close();
			bR = null;
			
			text = sB.toString();
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}finally {
			
			try {
				
				if(bR != null) bR.close();
				
			}catch(IOException iO) {
				
				iO.printStackTrace();
				
			}
			
		}
		
		return text;
		
	}

}
