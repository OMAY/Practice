package omay.tij.ch_9_polymorphism.ex4.shape;

//TODO: override print() method

public class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Circle.erase()");
	}
}
