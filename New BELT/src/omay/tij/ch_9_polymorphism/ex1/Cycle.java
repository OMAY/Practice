package omay.tij.ch_9_polymorphism.ex1;

//TODO: методы move пока что не нужны 

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

}

class Bicycle extends Cycle {
	@Override
	public void move(Cycle c) {
		System.out.println("The Bicycle is moving");
	}
}

class Tricycle extends Cycle {
	@Override
	public void move(Cycle c) {
		System.out.println("The Tricycle is moving");
	}
}