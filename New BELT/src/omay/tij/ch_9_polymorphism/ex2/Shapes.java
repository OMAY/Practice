package omay.tij.polymorphism.ex2;

/*Add the @Override annotation to the shapes example.*/
import omay.tij.polymorphism.ex2.shape.RandomShapeGenerator;
import omay.tij.polymorphism.ex2.shape.Shape;

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		for (int i = 0; i < s.length; i++)
			s[i] = gen.next();
		for (Shape shp : s)
			shp.draw();
	}
}
