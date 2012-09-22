package omay.tij.polymorphism.ex7;

/*Add a new type of Instrument to Music3.java and
 * verify that polymorphism works for your new type. */
import omay.tij.polymorphism.ex6.music.Note;

class Instrument {
	void play(Note n) {
		System.out.println("Instrument.play( )" + n);
	}

	String what() {
		return "Instrument";
	}

	void adjust() {
		System.out.println("Adjusting Instrument");
	}

	public String toString() {
		String s = what();
		return s;
	}
}

class Wind extends Instrument {
	void play(Note n) {
		System.out.println("Wind.play( )" + n);
	}

	String what() {
		return "Wind";
	}

	void adjust() {
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	void play(Note n) {
		System.out.println("Percussion.play()" + n);
	}

	String what() {
		return "Percussion";
	}

	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	void play(Note n) {
		System.out.println("Stringed.play( )" + n);
	}

	String what() {
		return "Stringed";
	}

	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Wind {
	void play(Note n) {
		System.out.println("Brass.play( )" + n);
	}

	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Woodwind extends Wind {
	void play(Note n) {
		System.out.println("Woodwind.play( )" + n);
	}

	String what() {
		return "Woodwind";
	}
}

class Guitar extends Stringed {
	void play(Note n) {
		System.out.println("Guitar.play( )" + n);
	}

	void adjust() {
		System.out.println("Adjusting Guitar");
	}

	String what() {
		return "Guitar";
	}
}

public class Music3 {

	public static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new Woodwind(), new Guitar() };
		for (Instrument i : orchestra) {
			System.out.println(i);
			tune(i);
		}

	}
}
