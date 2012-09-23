package omay.tij.interfaces.ex9;

import omay.tij.polymorphism.ex6.music.Note;

/*Refactor Music5.java by moving the common methods 
 in Wind, Percussion and Stringed into an abstract class.  */
abstract class Instrument {

	void play(Note n) {
		System.out.println(this + ".play()" + n);
	}

	void adjust() {
		System.out.println(this + ".adjust()");
	}
	public abstract String toString();
}

class Wind extends Instrument {
	public String toString() {
		return "Wind";
	}

}

class Percussion extends Instrument {
	public String toString() {
		return "Percussion";
	}

}

class Stringed extends Instrument {
	public String toString() {
		return "Stringed";
	}

}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}

public class ReMusic5 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}
