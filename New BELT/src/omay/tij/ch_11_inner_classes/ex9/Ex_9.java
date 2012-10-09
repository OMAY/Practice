package omay.tij.ch_11_inner_classes.ex9;
/*Create an interface with at least one method, and
implement that interface by defining an inner class within a method, which
returns a reference to your interface.*/
public class Ex_9 {
    public Inter defInner(){
        class Inner implements Inter {
            public void print(){
                System.out.println("The inner class defined by method of outer");
            }
        }
        return new Inner();
    }
    public static void main(String[]args){
        Ex_9 e9 = new Ex_9();
        e9.defInner().print();
    }

}
