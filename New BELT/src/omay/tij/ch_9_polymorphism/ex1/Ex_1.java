
package omay.tij.ch_9_polymorphism.ex1;

/*Create a Cycle class, with subclasses Unicycle, Bicycle 
 and Tricycle. Demonstrate that an instance of each type can be upcast to 
 Cycle via a ride() method.*/

//TODO: remove move() method call from ride()
//TODO: done

public class Ex_1 {
	public static void ride(Cycle c){

	}
	public static void main(String[] args) {
		Unicycle uni = new Unicycle();
		Bicycle bi = new Bicycle();
		Tricycle tri = new Tricycle();
		ride(uni);
		ride(bi);
		ride(tri);

	}

}
