package omay.tij.ch_11_inner_classes.ex5;

/*Create a class with an inner class. In a separate class, make
an instance of the inner class.
*/

//todo: отлично

public class Ex_5 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
    }
}
