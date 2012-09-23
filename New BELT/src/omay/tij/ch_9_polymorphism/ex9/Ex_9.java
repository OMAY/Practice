package omay.tij.polymorphism.ex9;

/*Create an inheritance hierarchy of Rodent:Mouse, Gerbil, Hamster, etc.
 In the base class, provide methods that are common to all Rodents,
 and override these in the derived classes to perform different 
 behaviors depending on the specific type of Rodent. Create an array of 
 Rodent, fill it with different specific types of Rodents, and call your 
 base-class methods to see what happens. 
 * 
 */
class Rodent {
	public void introduce() {
		System.out.println("This is a Rodent");
	}
}

class Mouse extends Rodent {
	public void introduce() {
		System.out.println("This is a Mouse");
	}
}

class Gerbil extends Rodent {
	public void introduce() {
		System.out.println("This is a Gerbill");
	}
}

class Hamster extends Rodent {
	public void introduce() {
		System.out.println("This is a Hamster");
	}
}

public class Ex_9 {
	public static void main(String[] args) {
		Rodent[] rods = { new Mouse(), new Gerbil(), new Hamster() };
		for (Rodent r : rods) {
			r.introduce();
		}

	}

}
