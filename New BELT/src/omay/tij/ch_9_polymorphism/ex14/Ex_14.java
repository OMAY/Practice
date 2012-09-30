package omay.tij.ch_9_polymorphism.ex14;

/*Modify Exercise 12 so that one of the member objects is 
 a shared object with reference counting, and demonstrate that it works 
 properly.  */

class Shared {
    //TODO: needs to be redone according to the task
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;
    Shared() {
        System.out.println("Creating " + this);
    }

	public void addRef() {
		refCount++;
	}
    @Override
    public String toString() {
        return "Shared " + id;
    }

}

class Rodent {
    private static long counter = 0;
    private final long id = counter++;

    Rodent(Shared sh) {
		System.out.println("Creating " + this);
        Shared shared = sh;
		shared.addRef();
	}
    @Override
    public String toString() {
        return "Rodent " + id;
    }

}

class Mouse extends Rodent {
	Mouse(Shared sh) {
		super(sh);
		System.out.println("New Mouse ");
	}

}

class Gerbil extends Rodent {
	Gerbil(Shared sh) {
		super(sh);
		System.out.println("New Gerbil ");
	}

}

class Hamster extends Rodent {
	Hamster(Shared sh) {
		super(sh);
		System.out.println("New Hamster ");
	}

}

public class Ex_14 {
	public static void main(String[] args) {
		Shared shared = new Shared();
		new Mouse(shared);
		new Gerbil(shared);
		new Hamster(shared);

	}

}
