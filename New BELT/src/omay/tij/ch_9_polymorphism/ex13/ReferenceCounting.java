package omay.tij.ch_9_polymorphism.ex13;

/*Add a finalize() method to ReferenceCounting.java to verify 
 * the termination condition (see the Initialization & Cleanup chapter). */

 class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;

	public Shared() {
		System.out.println("Creating " + this);
	}

	public void addRef() {
		refcount++;
	}

	void dispose() {
		if (--refcount == 0)
			System.out.println("Disposing " + this);
	}

    @Override
	protected void finalize() {
		if (refcount > 0) {
			System.out.println("ERROR! Object is using!");
		} else {
			System.out.println("finalize successfull");
		}
	}

    @Override
	public String toString() {
		return "Shared " + id;
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	public Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}

	void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}

    @Override
	public String toString() {
		return "Composing " + id;
	}
}

public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = { new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared),
				new Composing(shared) };
		for (Composing c : composing)
			c.dispose();
		shared.finalize();
		Shared shared2 = new Shared();
		Composing comp = new Composing(shared2);
		shared2.finalize();
	}

}