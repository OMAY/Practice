package omay.tij.ch_10_interfaces.ex16;

import java.nio.CharBuffer;
import java.util.Scanner;
public class AdaptedRandomChars extends RandomChars implements Readable {
	private int count;

	public AdaptedRandomChars(int count) {
		this.count = count;
	}

	public int read(CharBuffer cb) {
		if (count-- == 0)
			return -1;
		String result = Character.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomChars(16));
		while (s.hasNext())
			System.out.print(s.next() + " ");
	}
}
