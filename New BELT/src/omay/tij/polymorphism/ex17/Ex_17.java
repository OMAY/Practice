package omay.tij.polymorphism.ex17;

/*Using the Cycle hierarchy from Exercise 1,add a 
 balance() method to Unicycle and Bicycle, but not to Tricycle. Create 
 instances of all three types and upcast them to an array of Cycle. Try to call 
 balance() on each element of the array and observe the results. Downcast 
 and call balance() and observe what happens. 
 * 
 */
class Cycle {
	public void move(Cycle c) {
		System.out.println("The Cycle is moving");
	}

}

class Unicycle extends Cycle {
	@Override
	public void move(Cycle c) {
		System.out.println("The Unicycle is moving");
	}

	public void balance() {
		System.out.println("Keep the balance");
	}

}

class Bicycle extends Cycle {
	@Override
	public void move(Cycle c) {
		System.out.println("The Bicycle is moving");
	}

	public void balance() {
		System.out.println("Keep the balance");
	}
}

class Tricycle extends Cycle {
	@Override
	public void move(Cycle c) {
		System.out.println("The Tricycle is moving");
	}
}

public class Ex_17 {
	public static void ride(Cycle c) {
		c.move(c);
	}

	public static void main(String[] args) {
		Cycle[]cycles={ new Unicycle(),new Bicycle(),new Tricycle()};
		((Unicycle)cycles[0]).balance();
		((Bicycle)cycles[1]).balance();
		//!((Bicycle)cycles[2]).balance();//ERROR! cannot be cast!

	}

}