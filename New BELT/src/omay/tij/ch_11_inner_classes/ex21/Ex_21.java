package omay.tij.ch_11_inner_classes.ex21;

/*Create an interface that contains a nested class that has
a static method that calls the methods of your interface and displays the
results. Implement your interface and pass an instance of your
implementation to the method.*/

//TODO: хорошо

interface Inter {
    void printMe();

    public class Nested {
        public static void callInterMethod(Inter i) {
            System.out.println("i.printMe()");
            i.printMe();
        }
    }
}

class Impl implements Inter {
    @Override
    public void printMe() {
        System.out.println("Implemented method");
    }
}

public class Ex_21 {
    public static void main(String[] args) {
        Impl impl = new Impl();
        Inter.Nested.callInterMethod(impl);
    }
}
