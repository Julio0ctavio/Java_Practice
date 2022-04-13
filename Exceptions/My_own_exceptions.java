package Exceptions;

//This is our best way to create our exceptions:
class IncorrectTittleException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public IncorrectTittleException(String error) {
		super(error);
	}
}

public class My_own_exceptions {
	//This exception is kind of unchecked
	static void create_course(String title) {
		if(!title.toUpperCase().equals(title)) {
			throw new IncorrectTittleException("Your tittle must be in Upper case...");
		}else {
			System.out.println("Correct title");
		}
	}
	//This exception is kind of checked
	static void find_place(String title) throws IncorrectTittleException {
		if(!title.toUpperCase().equals(title)) {
			throw new IncorrectTittleException("Your place must be in Upper case...");
		}else {
			System.out.println("Correct name of place");
		}
	}
	public static void main(String [] args) {
		//create_course("Chess Course");
		try {
			find_place("AGUSACAlientes");
		}catch(IncorrectTittleException e) {
			System.out.println("Error, "+e.getMessage());
		}
		
	}
}
