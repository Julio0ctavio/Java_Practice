package Java8;

import java.util.Arrays;
import java.util.List;

class Team {
	private String name;
	
	Team(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + "]";
	}
	
}

public class MethodReference {
	public static void main(String[] args) {
		List<String> Baseball_teams = Arrays.asList("NY Yankees", "LA Dodgers", "SD Padres", "BOS Red Socks");
		//You can use the syntax with lambdas and foreach():
		//MLB_teams.forEach(element -> System.out.println(element));
		//This is other simple and clean way to do that with stream:
		Baseball_teams.stream().
		forEach(System.out::println);
		
		//Now we are trying to switch each string array to a league object in this way:
		Baseball_teams.stream().
		map(Team::new).
		forEach(System.out::println);
		
	}
}
