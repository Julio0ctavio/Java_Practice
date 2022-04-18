package Files;

import java.io.File;

public class Tree {
	
	public static void print(File[] files, String tabs) {
		String spaces = tabs.concat("-");
		if (files!=null) {
			for (File file : files) {
				if(file.isFile()) {
					System.out.printf("%s %s \n",spaces,file.getName());
				}else {
					System.out.printf("%s %s \n",spaces,file.getName());
					//Recursive call as you can see in the following line:
					print(file.listFiles(), spaces);
				}
			}
		}
	}
	
	public static void main(String [] args) {
		File f = new File("...");
		System.out.println(f.getName());
		print(f.listFiles(), "-");
	}
}
