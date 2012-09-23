package omay.tij.interfaces.ex10;
/*Modify Music5.java by adding a Playable interface. 
Move the play() declaration from Instrument to Playable. Add Playable 
to the derived classes by including it in the implements list.
Change tune()so that it takes a Playable instead of an Instrument . */
import omay.tij.polymorphism.ex6.music.Note;
interface Playable{
	void play(Note n);
}
interface Instrument {

	

	void adjust();
}

class Wind implements Instrument, Playable {
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		System.out.println(this + " .adjust()");
	}
}

class Percussion implements Instrument, Playable {
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		System.out.println(this + " .adjust()");
	}
}

class Stringed implements Instrument, Playable {
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
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

public class Music5 {
	static void tune(Playable p) {

		p.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] e) {
		for (Playable p : e)
			tune(p);
	}

	public static void main(String[] args) {

		Playable[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}
