package omay.tij.ch_9_polymorphism.ex8;

import omay.tij.ch_9_polymorphism.ex6.music.Note;

/*
Modify Music3.java so it randomly creates
Instrument objects the way Shapes.java does.
*/

//TODO: use proper access modifiers


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

class Guitar extends Stringed {
    @Override
	void play(Note n) {
		System.out.println("Guitar.play( )" + n);
	}

    @Override
	void adjust() {
		System.out.println("Adjusting Guitar");
	}

    @Override
    public String toString() {
		return "Guitar";
	}
}

public class Music3 {

	private static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

    //TODO: use this method in main() instead of foreach construction
	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
		Instrument[] orchestra = new Instrument[10];
		for (int i = 0; i < orchestra.length; i++) {
			orchestra[i] = gen.next();
		}
		for (Instrument instr : orchestra) {
			System.out.println(instr);
			tune(instr);
		}

	}
}
