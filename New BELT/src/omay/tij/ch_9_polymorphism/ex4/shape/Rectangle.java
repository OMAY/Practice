package omay.tij.ch_9_polymorphism.ex4.shape;

//TODO: override print() method

public class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Rectangle.erase()");
	}

}
