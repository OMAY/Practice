package omay.tij.ch_10_interfaces.ex2;

/*Create a class as abstract without including any abstract
 methods, and verify that you cannot create any instances of that class. */
abstract class AClass {
	public void f() {
	}
}

public class Ex_2 {
	public static void main(String[] args) {
		// AClass a = new AClass();
        AClass a = new AClass() {
        };
	}
}