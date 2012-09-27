package omay.tij.ch_10_interfaces.ex15;

/*Modify the previous exercise by creating an abstract 
 class and inheriting that into the derived class.  */
interface First {
	void firstOne();

	void firstTwo();
}

interface Second {
	void secondOne();

	void secondTwo();
}

interface Third {
	void thirdOne();

	void thirdTwo();
}

interface Combined extends First, Second, Third {
	void combined();
}

abstract class AbstractBase {
	public AbstractBase() {
		aPrint();

	}

	abstract void aPrint();

}

class SuperCombined extends AbstractBase implements Combined {
	public SuperCombined() {

	}

	void aPrint() {
		System.out.println("SuperCombined runs");
	}

	@Override
	public void firstOne() {
		System.out.println("firstOne()");

	}

	@Override
	public void firstTwo() {
		System.out.println("firstTwo()");

	}

	@Override
	public void secondOne() {
		System.out.println("secondOne()");

	}

	@Override
	public void secondTwo() {
		System.out.println("secondTwo()");

	}

	@Override
	public void thirdOne() {
		System.out.println("thirdOne()");

	}

	@Override
	public void thirdTwo() {
		System.out.println("thirdTwo()");
	}

	@Override
	public void combined() {
		System.out.println("combined()");

	}
}

public class Ex_15 {
	static void first(First f) {
		f.firstOne();
		f.firstTwo();
	}

	static void second(Second s) {
		s.secondOne();
		s.secondTwo();
	}

	static void third(Third t) {
		t.thirdOne();
		t.thirdTwo();
	}

	static void comb(Combined c) {
		c.combined();
	}

	public static void main(String[] args) {
		SuperCombined sc = new SuperCombined();
		first(sc);
		second(sc);
		third(sc);
		comb(sc);

	}

}
