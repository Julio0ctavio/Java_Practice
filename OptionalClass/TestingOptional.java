package OptionalClass;

import java.util.Optional;

public class TestingOptional {
	private static String[] names = {"Marcus", "Ezio", "Dante", "Katherina"};
	
	public static Optional<String> searchName(String n) {
		for (String name : names) {
			if(name.equals(n)) {
				return Optional.of(name);
			}
		}
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		String name = "Peter";
		Optional<String> result = searchName(name);
		if(result.isPresent()) {
			System.out.println(result.get().toString().toUpperCase());
		}else {
			System.out.printf("The name what you are looking for (%s) doesn't exist right here.", name);
		}
	}
}
