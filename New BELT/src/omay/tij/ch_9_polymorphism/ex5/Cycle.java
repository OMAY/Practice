package omay.tij.ch_9_polymorphism.ex5;

class Cycle {

	public void move(Cycle c) {
		System.out.println("Cycle is moving");
	}

	public void numberOfWheels() {
		System.out.println();
	}

}

class Unicycle extends Cycle {
	@Override
	public void move(Cycle c) {
		System.out.println("The Unicycle is moving");
	}

	@Override
	public void numberOfWheels() {
		System.out.println("One");
	}
}

class Bicycle extends Cycle {
	@Override
	public void move(Cycle c) {
		System.out.println("The Bicycle is moving");
	}

	@Override
	public void numberOfWheels() {
		System.out.println("Two");
	}
}

class Tricycle extends Cycle {
	@Override
	public void move(Cycle c) {
		System.out.println("The Tricycle is moving");
	}

	@Override
	public void numberOfWheels() {
		System.out.println("Three");
	}
}
