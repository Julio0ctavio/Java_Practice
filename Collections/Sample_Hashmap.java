package Collections;
import java.util.HashMap;
import java.util.Map;

public class Sample_Hashmap {
	public static void main(String [] args) {
		
		Map<Integer,String> avengers = new HashMap<>();
		Map<Integer,String> xmen = new HashMap<>();
		HashMap<Integer,String> marvel_icons = new HashMap<>();
		
		/*
		 * This collection is pretty known as a dictionaries in other languages, but here in JAVA
		 * we could call it as a HashMap, by the way, its functionality may change a little bit. 
		 * 
		 * With HashMap, we need to specify our key & value telling JAVA the data types that this HashMap will use.
		 */
		avengers.put(1,"Tony Stark");
		avengers.put(2, "Steve Rogers");
		avengers.put(3, "Peter Parker");
		xmen.put(5,"Scott Summers");
		xmen.put(6, "Henry \"Hank\" McCoy");
		xmen.put(7, "James \"Logan\" Howlett");
		
		/*
		 * We can use merge (instead of put) to add a new key or even change or update an existing key,
		 * this time we are adding a new key with merge:
		 */
		avengers.merge(8, "Black Widow",(oldValue, newValue) -> oldValue + newValue);
		xmen.merge(4, "Charles Xavier",(oldValue, newValue) -> oldValue + newValue);
		
		/*
		 * The next merge will replace the value of an existing key:
		 */
		avengers.merge(3, "Spiderman", (oldValue, newValue) -> oldValue + " -> " + newValue);
		xmen.merge(7, "Wolverin", (oldValue, newValue) -> oldValue + " -> " + newValue);
				
		//Using putAll() to join two or more HashMaps:
		marvel_icons.putAll(avengers);
		marvel_icons.putAll(xmen);
		
		System.out.println("Some Marvel icons: \n");
		marvel_icons.forEach((key, value) -> System.out.println(key + " : " +value));
		
		/* 
		 * We have another way to join two HashMaps rather than putAll(), we could use forEach() 
		 * that access each entries of avengers merge() inserts each entry from avengers to xmen
		 * just if we need to perform a specific change with the value:
		 */
		
        avengers.forEach((key, value) -> xmen.merge(key, value, (oldValue, newValue) -> {
			return newValue;
	    }));
        
        //We can use replace in HashMap values:
        xmen.replace(3, "The Amazing Spiderman");
        
        System.out.println("\nSome Marvel icons: \n");
        xmen.forEach((key, value) -> System.out.println(value));
        
	}
}
