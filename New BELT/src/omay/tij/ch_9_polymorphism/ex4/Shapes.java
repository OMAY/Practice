package omay.tij.ch_9_polymorphism.ex4;

/*Add a new type of Shape to Shapes.java and verify in main() that 
 * polymorphism works for your new type as it does in the old types. */
import omay.tij.ch_9_polymorphism.ex4.shape.RandomShapeGenerator;
import omay.tij.ch_9_polymorphism.ex4.shape.Shape;

//TODO: use print() method

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		for (int i = 0; i < s.length; i++)
			s[i] = gen.next();
		for (Shape shp : s) {
			shp.draw();

		}
	}
}
