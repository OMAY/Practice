package omay.tij.ch_10_interfaces.ex6;

import omay.tij.ch_10_interfaces.ex5.pack.ThreeMethods;

/*Prove that all the methods in an interface are 
 automatically public. 
 */
public class Ex_6 implements ThreeMethods {
	public void firstMethod() {
		System.out.println(1);
	}

	public void secondMethod() {
		System.out.println(2);
	}

	public void thirdMethod() {

		System.out.println(3);
		;
	}

	public static void main(String[] args) {

	}

}
/*to prove the task - delete one of "public" modifiers of three methods that
 implemented*/
