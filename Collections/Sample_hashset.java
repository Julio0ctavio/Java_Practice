package Collections;
import java.util.HashSet;

public class Sample_hashset {
	public static void main(String [] args) {
		//We can use HashSet collections when we try to use unique items.
		HashSet<String> NATO = new HashSet<>();
		NATO.add("USA");
		NATO.add("Germany");
		NATO.add("UK");
		NATO.add("France");
		//There is an exception when we try to add null parameter
		NATO.add(null);
		NATO.add(null);
		//After the second line adding null, this one will be included in the set as normal.
		NATO.add(null);
		NATO.add(null);
		NATO.add(null);
		System.out.println("NATO countries: " + NATO);
		NATO.remove(null);
		System.out.println("Removing the parameter null -> " + NATO);
	}
}
