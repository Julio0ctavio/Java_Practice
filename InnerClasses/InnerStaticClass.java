package InnerClasses;

class Outer_static{
	void foo() {
		System.out.println("Foo");
	}
	//Be careful, this class is static:
	static class Inner_static{
		void bar() {
			System.out.println("Bar");
		}
	}
}

public class InnerStaticClass {
	public static void main(String [] args) {
		Outer_static a = new Outer_static();
		a.foo();
		//It could works as "Outer_Class.Inner_Class b = a.new Inner_Class();" too
		Outer_static.Inner_static b = new Outer_static.Inner_static();
		b.bar();
	}
}
