package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class create_a_file {
	public static void main(String [] args) throws FileNotFoundException {
		File f=new File("simple_text.txt");
		try(PrintWriter pw=new PrintWriter(f)){
			pw.println("Hello folks! This is just a simple txt...");
			pw.println("Bla bla bla...");
		}
	}
}
