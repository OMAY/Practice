package omay.tij.polymorphism.ex10;

/*Create a base class with two methods. In the first 
 method, call the second method. Inherit a class and override the second 
 method. Create an object of the derived class, upcast it to the base type, and 
 call the first method. Explain what happens. 
 * 
 */
class BaseClass {
	public void firstMethod() {
		secondMethod();
	}

	public void secondMethod() {
		System.out.println("This is the second method of BaseClass");
	}
}

class InheritClass extends BaseClass {
	public void secondMethod() {
		System.out.println("This is the second method of InheritClass");
	}
}

public class Ex_10 {
	public static void main(String[] args) {
		BaseClass clas = new InheritClass();
		clas.firstMethod();
	}
}
