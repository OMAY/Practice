package omay.tij.ch_10_interfaces.ex5;

import omay.tij.ch_10_interfaces.ex5.pack.ThreeMethods;

/*Create an interface containing three methods, in its own
 package. Implement the interface in a different package. */

public class Ex_5 implements ThreeMethods {

	@Override
	public void firstMethod() {
		System.out.println(1);
	}

	@Override
	public void secondMethod() {
		System.out.println(2);
	}

	@Override
	public void thirdMethod() {
		System.out.println(3);
	}

	public static void main(String[] args) {
		Ex_5 e = new Ex_5();
		e.firstMethod();
		e.secondMethod();
		e.thirdMethod();
	}
}
