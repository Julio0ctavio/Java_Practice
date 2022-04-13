package Statics;

public class StaticUse {
	// Static blocs:
	static {
		System.out.println("Hi folks!");
	}
	
	@SuppressWarnings("static-access")
	public static void main(String [] args) {
	    A a = new B();
	    a.foo(); 
		A.foo();
		B.foo();
	}
}

class A {
	{
		System.out.println("How it's going?");
	}
	static void foo() {
		System.out.println("Foo");
	}
}

class B extends A{
	static void foo() {
		System.out.println("More N more foo...");
	}
}

