package omay.tij.ch_9_polymorphism.ex3.shape;

//TODO: override print() method
//TODO: done

public class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Circle.erase()");
	}

    @Override
    public void print() {
        System.out.println("This is a new Circle");
    }
}
