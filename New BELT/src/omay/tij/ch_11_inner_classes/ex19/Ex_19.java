package omay.tij.ch_11_inner_classes.ex19;

/*Create a class containing an inner class that itself
contains an inner class. Repeat this using nested classes. Note the names of
the. class files produced by the compiler. */
/*the names of classes are:
Ex_19
Ex_19$Nested
Ex_19$Nested$NestedNested
Ex_19$Inner
Ex_19$Inner$InnerInner
 */

//TODO: хорошо, это можно сказать почти высший пилотаж, хотя на практике так углубляться приходится не часто

public class Ex_19 {
    private class Inner {
        private class InnerInner {
            private void printMe() {
                System.out.println("InnerInner.printMe()");
            }
        }

        InnerInner newInIn() {
            return new InnerInner();
        }
    }

    Inner newIn() {
        return new Inner();
    }

    private static class Nested {
        private static class NestedNested {
            private void printMe() {
                System.out.println("NestedNested.printMe()");
            }
        }
    }

    public static void main(String[] args) {
        Nested nested = new Ex_19.Nested();
        Nested.NestedNested nestedNested = new Ex_19.Nested.NestedNested();
        nestedNested.printMe();
        Ex_19 e = new Ex_19();
        Inner inner = e.newIn();
        Inner.InnerInner innerInner = inner.newInIn();
        innerInner.printMe();
    }
}
