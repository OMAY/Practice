package omay.tij.ch_9_polymorphism.ex4.shape;

//TODO: override print() method
//TODO: done

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
    public void print() {
        System.out.println("This is a new Square");
    }

}
