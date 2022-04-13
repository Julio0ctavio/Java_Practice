package Exceptions;

public class Sample_Try_Catch {
	@SuppressWarnings("null")
	public static void main(String [] args) {
		try {
			
			//@SuppressWarnings("unused")
			//You can't divide by 0
			//int division=10/0;
			//The next line won't appear if the exception is before.
			//System.out.println("After troubles...");
			
			String name=null;
			System.out.println(name.toString());
			
			/*
			 * String list[] = {"Julio", "Moy"};
			 * System.out.println(list[3]);
			 */
			
		//The next hack is an union of catch blocks adding the pipe "|"
		}catch(ArithmeticException | NullPointerException e){
			System.err.printf("Arithmetic or NullPointer exceptions founded ... %s", e.getMessage());
		}catch(Exception e) {
			System.err.printf("Exception founded ... %s", e.getMessage());
		}
		//Always the finally block will run after catch block
		finally {
			System.out.println("The exception raises...");
		}
	}
}
