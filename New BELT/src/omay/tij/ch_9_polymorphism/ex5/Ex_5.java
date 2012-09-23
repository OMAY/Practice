package omay.tij.polymorphism.ex5;

/*Starting from Exercise1, add a wheels() method in 
 Cycle, which returns the number of wheels. Modify ride() to call wheels() 
 and verify that polymorphism works.*/
public class Ex_5 {
	public static void ride(Cycle c) {
		c.move(c);
		c.numberOfWheels();
	}

	public static void main(String[] args) {
		Cycle uni = new Unicycle();
		Cycle bi = new Bicycle();
		Cycle tri = new Tricycle();
		ride(uni);
		ride(bi);
		ride(tri);

	}

}
