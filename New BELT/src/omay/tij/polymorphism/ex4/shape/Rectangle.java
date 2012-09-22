package omay.tij.polymorphism.ex4.shape;

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
