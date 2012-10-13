package omay.tij.ch_11_inner_classes.ex26;
/*Create a class with an inner class that has a non-default
constructor (one that takes arguments). Create a second class with an inner
class that inherits from the first inner class. */
class WithInnerA{
    class Inner{
        public Inner(int i){
        }
    }
}
class WithInnerB{
    class Inner2 extends WithInnerA.Inner{
            public Inner2(WithInnerA wiA,int i) {
                wiA.super(i);
            }
    }
}
public class Ex_26 {
    public static void main(String[]args){

    }
}
