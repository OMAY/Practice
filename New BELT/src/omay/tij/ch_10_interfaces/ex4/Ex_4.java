package omay.tij.ch_10_interfaces.ex4;

/*Create an abstract class with no methods. Derive a class
 and add a method. Create a static method that takes a reference to the base
 class, downcast it to the derived class, and calls the method.
 1) In main(), demonstrate that it works.
 2) Now put the abstract declaration for the method
 in the base class, thus eliminating the need for the downcast.
 *
 */
abstract class AClass {
	// public abstract void print();

}

class BClass extends AClass {
	public void print() {
		System.out.println("Derived class of abstract");
	}
}

public class Ex_4 {
	public static void dCast(AClass a) {
		((BClass) a).print();
	}

	public static void main(String[] args) {
		AClass a = new BClass();
		// a.print();
		dCast(a);

	}

}

/*
 * For the first part of exercise don`t delete any comments upside, for the
 * second part - delete both comments in the code and it is no need of dCast()
 * method
 */
