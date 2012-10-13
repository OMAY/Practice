package omay.tij.ch_11_inner_classes.ex20;
/*Create an interface containing a nested class. Implement
this interface and create an instance of the nested class.
 */
interface Interface{
    class Nested{
    }
}
class Class implements Interface{
}
public class Ex_20 {
    public static void main(String[]args){
        Class c = new Class();
        Interface.Nested nested = new Interface.Nested();

    }
}
