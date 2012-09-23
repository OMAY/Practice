package omay.tij.interfaces.ex3;

/*Create a base class with an abstract print() method that 
 is overridden in a derived class. The overridden version of the method prints 
 the value of an int variable defined in the derived class. At the point of 
 definition of this variable, give it an on zero value.In the base-class 
 constructor, call this method. In main(), create an object of the derived 
 type, and then call its print() method.Explain the results. */
abstract class BaseClass {
	BaseClass() {
		print();
	}

	public abstract void print();
}

class DerivedClass extends BaseClass {
	private int i = 8;

	DerivedClass() {
		print();
	}

	public void print() {
		System.out.println(i);
	}

}

public class Ex_3 {

	public static void main(String[] args) {
		BaseClass b = new DerivedClass();
		b.print();

	}

}
/* Output: < 
 0 
 8 
 8 > the first zeros prints by calling constructor of the base class
 * after creating reference of derived class,
 * the first 8 called by constructor of derived class
 * the last 8 called by b.print().
 */
