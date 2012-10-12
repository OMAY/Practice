package omay.tij.ch_10_interfaces.ex17;

/*Prove that the fields in an interface are implicitly static
and final  */

interface I {
    int i = 9;
}

class J implements I {
    public J() {
        System.out.println("J-constructor");
        //i = 9; // - ERROR cannot assign a value to a static variable
    }
}

public class Ex_17 {
    public static void main(String[] args) {
        J newRef = new J();
        System.out.print(newRef.i);
    }


}
