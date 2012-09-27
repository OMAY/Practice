package omay.tij.ch_9_polymorphism.ex12;

/*Modify Exercise 9 so that it demonstrates the order of 
 initialization of the base classes and derived classes. Now add member 
 * objects to both the base and derived classes, and show the order in which 
 their initialization occurs during construction.
 */
class Rodent {
	public Rodent() {
		introduce("Rodent");
	}

	public void introduce(String s) {
		System.out.println("New " + s);
	}
}

class Mouse extends Rodent {
	public Mouse() {
		introduce("Mouse");
	}

	public void introduce(String s) {
		System.out.println("New " + s);
	}
}

class Gerbil extends Rodent {
	public Gerbil() {
		introduce("Gerbil");
	}

	public void introduce(String s) {
		System.out.println("New " + s);
	}
}

class Hamster extends Rodent {
	public Hamster() {
		introduce("Hamster");
	}

	public void introduce(String s) {
		System.out.println("New " + s);
	}
}

public class Ex_12 {
	public static void main(String[] args) {
		Rodent[] rods = { new Mouse(), new Gerbil(), new Hamster() };

	}

}
