package omay.tij.ch_11_inner_classes.ex6.pack1;

import omay.tij.ch_11_inner_classes.ex6.pack2.Outer;
import omay.tij.ch_11_inner_classes.ex6.pack3.Interface;

/*Create an interface with at least one method, in its own
package. Create a class in a separate package. Add a protected inner class
that implements the interface. In a third package, inherit from your class and,
inside a method, return an object of the protected inner class, upcasting to
the interface during the return .*/
public class Outer2 extends Outer {
    public static void main(String[]args){
        Outer2 o2 = new Outer2();
        Interface in2 = o2.in();
        in2.print();

    }
    //todo: можно так (если конструктор public)
    public Interface get() {
        return new Inner();
    }
}
