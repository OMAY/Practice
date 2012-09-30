package omay.tij.ch_9_polymorphism.ex12;

/*Modify Exercise 9 so that it demonstrates the order of 
 initialization of the base classes and derived classes. Now add member 
 * objects to both the base and derived classes, and show the order in which 
 their initialization occurs during construction.
 */

//TODO: use @Override annotation
//TODO: done
//TODO: remove introduce method
//TODO: done
class Rodent {
	Rodent() {

	}

	public void introduce(String s) {
		System.out.println("New " + s);
	}
}

class Mouse extends Rodent {
	Mouse() {

	}
    @Override
    public void introduce(String s) {
		System.out.println("New " + s);
	}
}

class Gerbil extends Rodent {
	Gerbil() {

	}

    @Override
	public void introduce(String s) {
		System.out.println("New " + s);
	}
}

class Hamster extends Rodent {
	Hamster() {

	}

    @Override
	public void introduce(String s) {
		System.out.println("New " + s);
	}
}

public class Ex_12 {
    //TODO: remove @SuppressWarnings annotation
    //TODO: done

	public static void main(String[] args) {
		Rodent[] rods = { new Mouse(), new Gerbil(), new Hamster() };

	}

}
