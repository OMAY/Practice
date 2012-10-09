package omay.tij.ch_9_polymorphism.ex14;

/*Modify Exercise 12 so that one of the member objects is 
 a shared object with reference counting, and demonstrate that it works 
 properly.  */

class NonShared {
    private static int counter = 0;
    private int id = counter++;

    public NonShared() {
        System.out.println("Creating non-shared object " + id);
    }
    protected void dispose() {
        System.out.println("Disposing non-shared object " + id);
    }
}

class Shared {
    private int refCount = 0;
    private static int counter = 0;
    private int id = counter++;

    public Shared() {
        System.out.println("Creating shared object " + id);
    }

    public void addRef() {
        System.out.println("Number of references to shared object " + id + " is " + ++refCount);
    }

    protected void dispose() {
        if(--refCount == 0) {
            System.out.println("Disposing shared object " + id);
        } else {
            System.out.println("Removing one reference to shared object " + id);
        }
    }
}

class Rodent {
    private Shared sharedMember;

    public Rodent(Shared shared) {
        System.out.println("Creating Rodent");
        this.sharedMember = shared;
        shared.addRef();
    }

    protected void dispose() {
        System.out.println("Disposing " + this);
        sharedMember.dispose();
    }
}

class Mouse extends Rodent {
    private NonShared nonSharedMember = new NonShared();

	public Mouse(Shared shared) {
		super(shared);
		System.out.println("Creating Mouse");
	}

    @Override
    protected void dispose() {
        nonSharedMember.dispose();
    }
}

class Gerbil extends Rodent {
    private Shared sharedMember;
    private NonShared nonSharedMember = new NonShared();

	public Gerbil(Shared shared) {
		super(shared);
        this.sharedMember = shared;
		System.out.println("Creating Gerbil");
	}

    @Override
    protected void dispose() {
        nonSharedMember.dispose();
    }
}

class Hamster extends Rodent {
    private Shared sharedMember;
    private NonShared nonSharedMember = new NonShared();

	public Hamster(Shared shared) {
		super(shared);
        this.sharedMember = shared;
		System.out.println("Creating Hamster");
	}

    @Override
    protected void dispose() {
        nonSharedMember.dispose();
    }
}

public class Ex_14 {
	public static void main(String[] args) {
		Shared sharedObject = new Shared();
		Rodent[] rodents = {
                new Hamster(sharedObject),
                new Gerbil(sharedObject),
                new Mouse(sharedObject)
        };
        for(Rodent rodent: rodents) {
            rodent.dispose();
        }
	}

}
