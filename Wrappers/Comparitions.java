package Wrappers;

class dog {
	
	private String name;
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof dog) {
			//Over here we just shaping our object as a dog:
			dog other_dog = (dog)obj;
			if (other_dog.getName().equals(this.name)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	dog(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Comparitions {
	public static void main(String [] args) {
		dog dogs[] = {new dog("Luna Bella"), new dog("Luna Bella"), new dog("Mayinovicth")};
		//Now we will compare this objects, which doesn't seem to be the same because of their names:
		System.out.println("Does "+ dogs[0].getName() + " is the same dog as " + dogs[2].getName() + "?");
		//Using the same equals function to compare:
		System.out.println(dogs[0].equals(dogs[2]));
		System.out.println("Does "+ dogs[0].getName() + " is the same dog as " + dogs[1].getName() + "?");
		//Using the same equals function to compare:
		System.out.println(dogs[0].equals(dogs[1]));
	}
}
