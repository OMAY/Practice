package omay.tij.ch_10_interfaces.ex13;

/*Create an interface, and inherit two new interfaces from 
 that interface. Multiply inherit a third interface from the second two. */

interface First {

}

interface SecondInheritFromFirst1 extends First {

}

interface SecondInheritFromFirst2 extends First {

}

interface ThirdInheritFromBothSecond extends SecondInheritFromFirst1,
        SecondInheritFromFirst2 {

}

public class Ex_13 {

    public static void main(String[] args) {

    }

}
