package omay.tij.ch_11_inner_classes.ex6.pack2;

import omay.tij.ch_11_inner_classes.ex6.pack3.Interface;

public class Outer {
   protected class Inner implements Interface{
        public Inner() {}
        public void print(){
            System.out.println("The inner class of pack2");
        }
    }

    //TODO: порождающий метод не обязателен, т.к. внутр. класс - protected, а Outer2 - потомок Outer, но нужен паблик конструктор, в принципе это два альтернативных решения
    public Interface in(){
        return new Inner();
    }
}
