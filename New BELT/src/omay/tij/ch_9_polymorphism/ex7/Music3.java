package omay.tij.ch_9_polymorphism.ex7;

/*Add a new type of Instrument to Music3.java and
 * verify that polymorphism works for your new type. */
import omay.tij.ch_9_polymorphism.ex6.music.Note;

//TODO: use proper access modifiers
//TODO: done

class Instrument {
	public void play(Note n) {
		System.out.println("Instrument.play( )" + n);
	}

	public void adjust() {
		System.out.println("Adjusting Instrument");
	}

    @Override
    public String toString(){
        return "Instrument";
    }

}

class Wind extends Instrument {

    @Override
	public void play(Note n) {
		System.out.println("Wind.play( )" + n);
	}

    @Override
    public String toString(){
		return "Wind";
	}

    @Override
	public void adjust() {
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument {
    @Override
	public void play(Note n) {
		System.out.println("Percussion.play()" + n);
	}

    @Override
    public String toString(){
		return "Percussion";
	}

    @Override
	public void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
    @Override
	public void play(Note n) {
		System.out.println("Stringed.play( )" + n);
	}

    @Override
    public String toString(){
		return "Stringed";
	}

    @Override
	public void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Wind {
    @Override
	public void play(Note n) {
		System.out.println("Brass.play( )" + n);
	}

    @Override
	public void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Woodwind extends Wind {
    @Override
	public void play(Note n) {
		System.out.println("Woodwind.play( )" + n);
	}

    @Override
    public String toString(){
		return "Woodwind";
	}
}

class Guitar extends Stringed {
    @Override
	public void play(Note n) {
		System.out.println("Guitar.play( )" + n);
	}

    @Override
	public void adjust() {
		System.out.println("Adjusting Guitar");
	}

    @Override
    public String toString(){
		return "Guitar";
	}
}

public class Music3 {

	private static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

    //TODO: use this method ( tuneAll(orchestra); )in main() instead of foreach construction
    //TODO: done
	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e){
			tune(i);
        }
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new Woodwind(), new Guitar() };
		tuneAll(orchestra);

	}
}
