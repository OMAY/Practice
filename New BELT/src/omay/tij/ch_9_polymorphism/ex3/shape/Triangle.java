package omay.tij.ch_9_polymorphism.ex3.shape;

//TODO: override print() method
//TODO: done

public class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Triangle.erase()");
	}

    @Override
    public void print() {
        System.out.println("This is a new Triangle");
    }
}
