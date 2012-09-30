package omay.tij.ch_10_interfaces.ex1;

/*Modify Exercise 9 in the previous chapter so that Rodent
 is an abstract class. Make the methods of Rodent abstract whenever
 possible. */
abstract class Rodent {
	public abstract void introduce();
}

class Mouse extends Rodent {
	public void introduce() {
		System.out.println("This is a Mouse");
	}
}

class Gerbil extends Rodent {
	public void introduce() {
		System.out.println("This is a Gerbil");
	}
}

class Hamster extends Rodent {
	public void introduce() {
		System.out.println("This is a Hamster");
	}
}

public class Ex_1 {
	public static void main(String[] args) {
		Rodent[] rods = { new Mouse(), new Gerbil(), new Hamster() };
		for (Rodent r : rods) {
			r.introduce();
		}
	}

}