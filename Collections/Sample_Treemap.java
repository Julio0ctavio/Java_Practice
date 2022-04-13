package Collections;
import java.util.TreeMap;

public class Sample_Treemap {
	public static void main(String [] args) {
		
		/* 
		 * The only difference between this structure against HashMap is the use of NavigableMap and SortedMap interfaces
		 * it's worth to mention that we use methods related to the natural order. Like we saw in TreeSet or even PriorityQueue.
		 * 
		 * Note: TreeSet is one the most important implementations of the interface SortedSet which uses a "Tree" for the storage,
		 * however, the PriorityQueue uses a "Queue", first in first out.
		 */
		
		TreeMap<Integer,String> avengers = new TreeMap<>();
		TreeMap<Integer,String> xmen = new TreeMap<>();

		avengers.put(1,"Tony Stark");
		avengers.put(2, "Steve Rogers");
		avengers.put(3, "Peter Parker");
		xmen.put(5,"Scott Summers");
		xmen.put(6, "Henry \"Hank\" McCoy");
		xmen.put(7, "James \"Logan\" Howlett");
		//Deleting last entry:
		xmen.pollLastEntry();
		
		System.out.println("First element of the xmen TreeMap: " + avengers.firstEntry());
		System.out.println("Last element of the xmen TreeMap: " + xmen.lastEntry());
        
	}
}
