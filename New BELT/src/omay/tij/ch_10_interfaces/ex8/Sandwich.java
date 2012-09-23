package omay.tij.interfaces.ex8;


/*In polymorphism.Sandwich.java, create an interface 
called FastFood (with appropriate methods)and change Sandwich so that 
it also implements FastFood. */
class Bread {
	Bread() {
		System.out.println("Bread()");
	}
}

class Cheese {
	Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Pickle {
	Pickle() {
		System.out.println("Pickle()");
	}
}

interface FastFood{
	void newOne();
	
}

public class Sandwich implements FastFood {
	public void newOne(){
		new Bread();
		new Cheese();
		new Lettuce();
		new Pickle();
		
	}
	public Sandwich() {
		System.out.println("Sandwich()");
	}

	public static void main(String[] args) {
		new Sandwich().newOne();
	}
}