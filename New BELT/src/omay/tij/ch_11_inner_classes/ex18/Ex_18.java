package omay.tij.ch_11_inner_classes.ex18;
/*Create a class containing a nested class. In main() ,
create an instance of the nested class. */

public class Ex_18 {
    private static class NestedClass{
        public void printMe(){
            System.out.println("NestedClass.printMe()");
        }
    }
    public static void main(String[]args){
        NestedClass n = new NestedClass();
        n.printMe();
    }
}
