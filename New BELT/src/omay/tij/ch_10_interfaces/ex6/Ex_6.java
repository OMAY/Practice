package omay.tij.ch_10_interfaces.ex6;

/*Prove that all the methods in an interface are
 automatically public.
 */

interface Test {
    void a();
}

public class Ex_6 implements Test {
	public void a() {
		System.out.println("a");
	}
    public static void main(String[] args) {

	}

}

