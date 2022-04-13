package InnerClasses;

class Outer_Class{
	void foo() {
		System.out.println("Foo");
	}
	class Inner_Class{
		void bar() {
			System.out.println("Bar");
		}
	}
}

public class Regular_innerclass {
	public static void main(String [] args) {
		Outer_Class a = new Outer_Class();
		a.foo();
		//It could works as "Outer_Class.Inner_Class b = a.new Inner_Class();" too
		Outer_Class.Inner_Class b = new Outer_Class().new Inner_Class();
		b.bar();
	}
}
