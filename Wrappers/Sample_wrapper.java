package Wrappers;

public class Sample_wrapper {
	public static void main (String [] args) {
		//The next line would be the same as a type of data:
		int i=10;
		System.out.println("Integer value of variable i: " + i);
		//Wrapper is the type of data converted as an object with its own methods:
		Integer j=173;
		//Showing up the float value of 'j':
		System.out.println("Float Value from wrapper 'j', who is an object: " + j.floatValue());
		//Playing with some methods of 'j':
		System.out.println("Bit Value of 'j': " + j.byteValue());
		System.out.println("Octal Value of 'j': " + Integer.toOctalString(j));
	}
}
