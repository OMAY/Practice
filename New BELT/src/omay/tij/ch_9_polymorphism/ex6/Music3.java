package omay.tij.ch_9_polymorphism.ex6;

/*Change Music3.java so that what() becomes the root 
 Object method toString(). Try printing the Instrument objects using 
 System.out.println ()(without any casting). */

//TODO: use proper access modifiers

import omay.tij.ch_9_polymorphism.ex6.music.Note;

class Instrument {
	void play(Note n) {
		System.out.println("Instrument.play( )" + n);
	}

	void adjust() {
		System.out.println("Adjusting Instrument");
	}

    @Override
    public String toString() {
        return "Instrument";
    }
}

class Wind extends Instrument {
	@Override
	void play(Note n) {
		System.out.println("Wind.play( )" + n);
	}

	@Override
    public String toString() {
		return "Wind";
	}

	@Override
	void adjust() {
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	@Override
	void play(Note n) {
		System.out.println("Percussion.play()" + n);
	}

	@Override
    public String toString() {
		return "Percussion";
	}

	@Override
	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	@Override
	void play(Note n) {
		System.out.println("Stringed.play( )" + n);
	}

	@Override
    public String toString() {
		return "Stringed";
	}

	@Override
	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Wind {
	@Override
	void play(Note n) {
		System.out.println("Brass.play( )" + n);
	}

	@Override
	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Woodwind extends Wind {
	@Override
	void play(Note n) {
		System.out.println("Woodwind.play( )" + n);
	}

	@Override
    public String toString() {
		return "Woodwind";
	}
}

public class Music3 {

	private static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new Woodwind() };
		for (Instrument i : orchestra) {
			System.out.println(i);
			tune(i);
		}

	}
}
