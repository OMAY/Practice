package omay.tij.ch_11_inner_classes.ex11;

import omay.tij.ch_11_inner_classes.ex9.Inter;

public class Outer11 {
    private class Inner implements Inter {
        public void print(){
            System.out.println("Prevate inner class");
        }
    }
    public Inter newInner1(){
        return new Inner();
    }
    public Inner newInner2(){
        return new Inner();
    }
}

