package omay.tij.ch_11_inner_classes.ex11;

/*Create a private inner class that implements a public
interface. Write a method that returns a reference to an instance of the
private inner class, upcast to the interface. Show that the inner class is
completely hidden by trying to downcast to it.*/

import omay.tij.ch_11_inner_classes.ex9.Inter;

public class Ex_11 {
    public static void main(String[] args) {
        Outer11 o = new Outer11();
        Inter i = o.newInner1();
        i = o.newInner2();
        //Inner in = o.newInner2();  //-not visible
    }
}

