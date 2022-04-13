package Collections;
import java.util.TreeSet;

public class Sample_Treeset {
	public static void main(String [] args) {
		TreeSet <String> ONU = new TreeSet<>();
		/*
		 * The main difference according with HashSet would be the natural order,
		 * you could say this collection is the fusion between PriorityQueue and HashSet.
		 */
		ONU.add("Mexico");
		ONU.add("Spain");
		ONU.add("Japan");
		ONU.add("Russia");
		ONU.add("Brazil");
		System.out.println("The following countries belong to the ONU, we know that others are missing ...\n" + ONU);
	}
}
