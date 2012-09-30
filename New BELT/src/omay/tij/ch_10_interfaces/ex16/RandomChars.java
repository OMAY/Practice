package omay.tij.ch_10_interfaces.ex16;

import java.util.Random;

/*Create a class that produces a sequence of chars. Adapt 
 this class so that it can be an input to a Scanner object. */
public class RandomChars {
	private static Random rand = new Random(65);

	public char next() {

		return (char) rand.nextInt(90);
	}

	public static void main(String[] args) {
		RandomChars rd = new RandomChars();
		for (int i = 0; i < 10; i++)
			System.out.print(rd.next() + "");
	}
}
