package omay.tij.ch_11_inner_classes.ex23;
/*Create an interface U with three methods. Create a class
A with a method that produces a reference to a U by building an anonymous
inner class. Create a second class B that contains an array of U. B should
have one method that accepts and stores a reference to a U in the array, a
second method that sets a reference in the array (specified by the method
argument) to null, and a third method that moves through the array and
calls the methods in U. In main(), create a group of A objects and a single
B. Fill the B with U references produced by the A objects. Use the B to call
back into all the A objects. Remove some of the U references from the B.  */

import java.util.ArrayList;

interface U{
    void m1();
    void m2();
    void m3();
}
class A{
    public U produceU(){
        return new U() {
            @Override
            public void m1() {
                System.out.println("U.m1()");
            }
            @Override
            public void m2() {
                System.out.println("U.m2()");
            }
            @Override
            public void m3() {
                System.out.println("U.m3()");
            }
        };
    }
}
class B{
    private ArrayList<U> us = new ArrayList<U>();
    public void acceptAndStore(U u){
        us.add(u);
    }
    public void setToNull(int i){
        System.out.println("Try to removing some U");
        if(us.size()<=i)
            return;
        else
        us.remove(i);
    }
    public void callUsMethod(){
        for(U u:us){
            u.m1();
            u.m2();
            u.m3();
        }
    }
}

public class Ex_23 {
    public static void main(String[]args){
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        B b = new B();
        b.acceptAndStore(a1.produceU());
        b.acceptAndStore(a2.produceU());
        b.acceptAndStore(a3.produceU());
        b.callUsMethod();
        b.setToNull(2);
        System.out.println();
        b.callUsMethod();
    }
}
