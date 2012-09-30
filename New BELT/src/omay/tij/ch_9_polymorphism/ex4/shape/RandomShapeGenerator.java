package omay.tij.ch_9_polymorphism.ex4.shape;

import java.util.Random;

//TODO: place default option in the end of switch construction

public class RandomShapeGenerator {
	private Random rand = new Random();

	public Shape next() {
		switch (rand.nextInt(4)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		case 3:
			return new Rectangle();
		}
	}
}
