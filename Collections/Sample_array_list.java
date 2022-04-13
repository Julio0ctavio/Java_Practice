package Collections;
import java.util.ArrayList;


public class Sample_array_list {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String [] args) {
		//This arraylist has any kind of types of data:
		ArrayList array = new ArrayList();
		array.add("Hey folks!");
		array.add(12.87f);
		array.add('C');
		array.add(false);
		System.out.println(array);
		
		//By the way, we can specify which kind of type we want
		ArrayList<String> array_str =  new ArrayList<>();
		array_str.add("This");
		array_str.add("is");
		array_str.add("just");
		array_str.add("a");
		array_str.add("quick");
		array_str.add("example");
		String sentence=array_str.toString();
		//Magic REGEX, what would I do without you?
		System.out.println(sentence.replaceAll("\\[|\\]|,",""));
		
		//This kind of data structures would be inefficient 
		//when we try to make insertions & deletes like a queue or even a linked list
	}
}
