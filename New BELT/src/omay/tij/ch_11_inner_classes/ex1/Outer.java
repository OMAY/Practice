package omay.tij.ch_11_inner_classes.ex1;

/*Write a class named Outer that contains an inner class
named Inner. Add a method to Outer that returns an object of type Inner .
In main(), create and initialize a reference to an Inner .
 */

//TODO: отлично

public class Outer {
    class Inner {
        Inner() {
            System.out.println("The inner class");
        }
    }

    public Inner createInner() {
        return new Inner();

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.createInner();
    }

}
