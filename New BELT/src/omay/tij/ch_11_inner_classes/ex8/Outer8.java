package omay.tij.ch_11_inner_classes.ex8;
/*Determine whether an outer class has access to the
private elements of its inner class. */
public class Outer8 {

    static class Inner8{
        private int i =7;
    }
    public void changeI(){
        Inner8 i8 = new Inner8();
        System.out.println("i = "+i8.i);
        i8.i= 9;
        System.out.println("Now i = "+i8.i);

    }
    public static void main(String[]args){
        Outer8 o8 = new Outer8();
        o8.changeI();

    }
}
