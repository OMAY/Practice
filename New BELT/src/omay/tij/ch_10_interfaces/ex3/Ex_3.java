package omay.tij.ch_10_interfaces.ex3;

/*Create a base class with an abstract print() method that
 is overridden in a derived class. The overridden version of the method prints
 the value of an int variable defined in the derived class. At the point of
 definition of this variable, give it an on zero value.In the base-class
 constructor, call this method. In main(), create an object of the derived
 type, and then call its print() method.Explain the results. */
abstract class BaseClass {
	BaseClass() {
        //TODO: этот вызов должен быть по условию, но, как я говорил ранее, вызов не приватных методов в конструкторе
        //это потенциально опасная идея, после прочтения и эту тудушку нужно удалить
        //пользуясь случаем задам вопрос: в каком порядке выполняется инициализация класса при вызове конструктора
        //класса-потомка т.е. есть: конструкторы в обоих классах, блоки инициализации в обоих классах, статические блоки
        //инициализации в разных классах, инициализация полей в обоих классах, при выполнении программы выполняется
        //создание объекта класса-потомка, расположи в порядке вызова все перечисленные выше элементы, ответ лучше
        //напиши на почту, комментарии в исходниках это не лучший способ ведения переписки.
		print();
	}

	public abstract void print();
}

class DerivedClass extends BaseClass {
	private int i = 8;

	DerivedClass() {
		print();
	}

	public void print() {
		System.out.println(i);
	}

}

public class Ex_3 {

	public static void main(String[] args) {
		BaseClass b = new DerivedClass();
		b.print();

	}

}
/*
 * Output: 
 * < 
 * 0 
 * 8 
 * 8 
 * > the first zeros prints by calling constructor of the base
 * class after creating reference of derived class, the first 8 called by
 * constructor of derived class the last 8 called by b.print().
 */
