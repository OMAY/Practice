package omay.tij.ch_11_inner_classes.ex7;

/*Create a class with a private field and a private method.
Create an inner class with a method that modifies the outer-class field and
calls the outer-class method. In a second outer-class method, create an object
of the inner class and call its method, then show the effect on the outer-class
object.
*/

//todo: ок

public class Outer {
    private int i = 5;

    private void print() {
        System.out.println("Private method of outer class, private int i =(5) " + i);
    }

    public Outer() {
        print();
    }

    class Inner {
        public void modify() {
            i = 8;
            print();
        }
    }

    public void f() {
        Inner in = new Inner();
        in.modify();
        System.out.println("Now private int i = " + i);
    }

}
