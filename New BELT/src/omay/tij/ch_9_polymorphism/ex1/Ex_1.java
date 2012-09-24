package omay.tij.ch_9_polymorphism.ex1;

/*Create a Cycle class, with subclasses Unicycle, Bicycle 
 and Tricycle. Demonstrate that an instance of each type can be upcast to 
 Cycle via a ride() method.*/

/*TODO: по сути сейчас демонстрируется полиморфизм,а не восходящее преобразование,
 * по замыслу автора книги тут нужно продемонстрировать тот факт, что метод, у
 * которого аргумент должен принадлежать родительскому классу, может быть вызван
 * с экземпляром класса-потомка в качестве аргумента, т.е. вызов метода логичнее
 * вообще убрать, заодно можно убрать сам метод из объявления класса, т.к.
 * по условию он нам не нужен, а в одном из следующих упражнений, где надо будет
 * доработать первое, эти методы при необходимости останутся. 
*/
public class Ex_1 {
	public static void ride(Cycle c) {
		c.move(c);
	}

	public static void main(String[] args) {
		Unicycle uni = new Unicycle();
		Bicycle bi = new Bicycle();
		Tricycle tri = new Tricycle();
		ride(uni);
		ride(bi);
		ride(tri);

	}

}
