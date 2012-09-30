package omay.tij.ch_11_inner_classes.ex3;
/*Modify Exercise 1 so that Outer has a private String
field (initialized by the constructor), and Inner has a toString() that
 displays this field. Create an object of type Inner and display it.
 */
public class Outer {
    private String s;
    public Outer(){
        s = "Outer String";
    }
    class Inner{
        public String toString(){
            return s;
        }
    }
    public Inner createInner(){
        return new Inner();

    }
    public static void main(String[]args){
        Outer outer = new Outer();
        Outer.Inner inner = outer.createInner();
        System.out.println(inner);
    }

}

