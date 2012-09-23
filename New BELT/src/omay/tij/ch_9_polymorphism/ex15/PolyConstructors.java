package omay.tij.ch_9_polymorphism.ex15;

/*Add a RectangularGlyph to PolyConstructors.java 
 and demonstrate the problem described in this section. */

class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}

	Glyph() {
		System.out.println("Glyph()before draw()");
		draw();
		System.out.println("Glyph()after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(),radius = " + radius);
	}

	void draw() {
		System.out.println("RoundGlyph.draw(),radius = " + radius);
	}
}

class RectangularGlyph extends Glyph {
	private int aSide = 18;
	private int bSide = 33;

	RectangularGlyph(int a, int b) {
		aSide = a;
		bSide = b;
		System.out.println("RectangularGlyph.RectangularGlyph.draw, aSide = "
				+ aSide + " bSide = " + bSide);
	}

	void draw() {
		System.out.println("RectangularGlyph.draw, aSide = " + aSide
				+ " bSide = " + bSide);
	}

}

public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
		new RectangularGlyph(3, 7);
	}
}