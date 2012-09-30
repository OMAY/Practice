package omay.tij.ch_10_interfaces.ex7;

/*Change Exercise 9 in the Polymorphism chapter so that
 Rodent is an interface. */

interface Rodent {
	public void introduce();
}

class Mouse implements Rodent {
	public void introduce() {
		System.out.println("This is a Mouse");
	}
}

class Gerbil implements Rodent {
	public void introduce() {
		System.out.println("This is a Gerbill");
	}
}

class Hamster implements Rodent {
	public void introduce() {
		System.out.println("This is a Hamster");
	}
}

public class Ex_7 {
	public static void main(String[] args) {
		Rodent[] rods = { new Mouse(), new Gerbil(), new Hamster() };
		for (Rodent r : rods) {
			r.introduce();
		}

	}

}
