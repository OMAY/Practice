package omay.tij.ch_11_inner_classes.ex13;

import omay.tij.ch_11_inner_classes.ex9.Inter;

/*
Repeat Exercise 9 using an anonymous inner class.
*/

//TODO: хорошо, сначала задумался причём тут Inter, на автомате читал Inner

public class Ex_13 {
    public Inter newInter() {
        return new Inter() {
            @Override
            public void print() {
                System.out.println("The inner class defined by method of outer");
            }
        };
    }

    public static void main(String[] args) {
        Inter in = new Ex_13().newInter();
        in.print();
    }
}
