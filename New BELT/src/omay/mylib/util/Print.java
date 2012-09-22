package omay.mylib.util;

import java.io.*;

public class Print {
	// Print with a new line:
	public static void print(Object obj) {
		System.out.println(obj);
	}

	// Print a new line by itself:
	public static void print() {
		System.out.println();
	}

	// Print with no line break:
	public static void printnb(Object obj) {
		System.out.print(obj);
	}

	// The newJava SE5 printf()(fromC) :
	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}
}
