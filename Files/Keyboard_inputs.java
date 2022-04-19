package Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard_inputs {
	
	public static String readmessage(String prompt) throws IOException {
		System.out.print(prompt);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static int readInteger(String prompt) throws NumberFormatException, IOException {
		return Integer.parseInt(readmessage(prompt));
	}
	
	public static void main(String [] args) throws IOException {
		String name = readmessage("Hey, What's your name? \t\n");
		System.out.printf("Hi %s!\n",name);
		int age = readInteger("How old are you, ? \t\n");
		System.out.printf("Age of %s -> %d years",name,age);
	}
}
