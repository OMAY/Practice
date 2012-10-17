package omay.tij.ch_11_inner_classes.ex20;

/*Create an interface containing a nested class. Implement
this interface and create an instance of the nested class.*/

//TODO: хорошо, но задание странное, зачем тут реализация интерфейса...

interface Interface {
    class Nested {

    }
}

class Class implements Interface {

}

public class Ex_20 {
    public static void main(String[] args) {
        Class c = new Class();
        Interface.Nested nested = new Interface.Nested();
        //может быть имелось в виду то что можно написать
        Class.Nested nested2 = new Class.Nested();
    }
}
