package Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Sample_Collections {
	public static void main(String [] args) {
		List<String> Planets = new ArrayList<>();
		Planets.add("Earth");
		Planets.add("Mars");
		Planets.add("Jupiter");
		Planets.add("Neptune");
		Planets.add("Saturn");
		/*
		 * Here we have a pretty good package of Collections, which has a bunch of static methods we can use to our list or data sets:
		 * As an example we can search for an item with binary search, obviously if the list is sorted.
		 */
		Collections.sort(Planets);
		System.out.println("Sorted List:" + Planets);
		Collections.shuffle(Planets);
		System.out.println("Shuffled List" + Planets);
		//Like I said before, we need to sort the list first:
		Collections.sort(Planets);
		int index = Collections.binarySearch(Planets, "Neptune");
		System.out.println("Looking for " + Planets.get(index));
	}
}
