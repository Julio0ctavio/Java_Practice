package Collections;
import java.util.Vector;

/*
 * Is worth mentioning that the difference between vectors and 
 * Arraylist is vector synchronizes the element that are looking for, 
 * besides Arraylist doesn't care this connection of elements, 
 * so this kind of data structure is commonly represented as threads.
*/

public class Sample_vector {
	public static void main(String [] args) {
		Vector<String> vec = new Vector<>();
		vec.add("JuliusKaiser");
		System.out.println(String.format("Just an new vector string: \n%s",vec));
	}
}
