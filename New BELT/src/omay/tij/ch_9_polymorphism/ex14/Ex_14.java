package omay.tij.ch_9_polymorphism.ex14;

/*Modify Exercise 12 so that one of the member objects is 
 a shared object with reference counting, and demonstrate that it works 
 properly.  */
class Shared {
    //TODO: use camelCase for fields'/methods' names
    //Todo: done
    //TODO: use reference counting, disposing, etc.
	private long refcount;

	public void addRef() {
		refcount++;
		System.out.println(refcount);
	}

}

class Rodent {

    Rodent(Shared sh) {
		System.out.print("New Rodent ");
        Shared s = sh;
		s.addRef();
	}

}

class Mouse extends Rodent {
	public Mouse(Shared sh) {
		super(sh);
		System.out.println("New Mouse ");
	}

}

class Gerbil extends Rodent {
	public Gerbil(Shared sh) {
		super(sh);
		System.out.println("New Gerbil ");
	}

}

class Hamster extends Rodent {
	public Hamster(Shared sh) {
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
