package omay.tij.ch_11_inner_classes.ex12;

public class Outer {
    private int i =5;
    private void print(){
        System.out.println("Private method of outer class, private int i =(5) "+i);
    }
    public Outer(){
        print();
    }
    public void anonymousClass(){
        new Object(){
            void modify(){
                i = 8;
                print();
            }
        }.modify();
    }
}

