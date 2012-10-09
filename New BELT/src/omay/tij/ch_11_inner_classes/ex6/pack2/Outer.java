package omay.tij.ch_11_inner_classes.ex6.pack2;

import omay.tij.ch_11_inner_classes.ex6.pack3.Interface;

public class Outer {
   protected class Inner implements Interface{
        public void print(){
            System.out.println("The inner class of pack2");
        }
    }
    public Interface in(){
        return new Inner();
    }
}
