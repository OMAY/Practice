package omay.tij.ch_9_polymorphism.ex3.shape;

public class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Square.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}
	@Override
	public void print(){
		System.out.println("This is a new square");
	}
}