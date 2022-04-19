package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class read_a_file {
	public static void main(String [] args) throws IOException {
		File f=new File("simple_text.txt");
		if(f.exists()) {
			try (FileReader fr = new FileReader(f)){
				BufferedReader br = new BufferedReader(fr);
				String cadena=null;
				do {
					cadena=br.readLine();
					if (cadena!=null) {
						System.out.println(cadena);
					}	
				} while(cadena != null);
			}
			
		}else {
			System.out.printf("The file you have selected (%s) weren't found\n", f.getName());
		}
	}
}
