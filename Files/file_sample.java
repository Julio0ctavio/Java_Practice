package Files;

import java.io.File;

public class file_sample {
	public static void main(String [] args) {
		File file = new File("...");
		System.out.printf("Is file?  %b\n", file.isFile());
		System.out.printf("Is a directory?  %b\n", file.isDirectory());
		System.out.printf("Full path:  %s\n", file.getPath());
		File[] content = file.listFiles();
		for (File f : content) {
			System.out.println(f.getName());
			System.out.println("Can we read this file: " + f.canRead() + "\n\n");
		}
	}
}
