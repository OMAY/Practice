package omay.tij.ch_11_inner_classes.ex10;

public class Ex_10 {
    private void createNewInner(boolean b){
        if(b){
            class Inner {
                public Inner(){
                    System.out.println("The inner class defined by method of outer");
                }

            }
            Inner in = new Inner();
        }
    }

    public void defInner(){
        createNewInner(true);
    }

    public static void main(String[]args){
        Ex_10 e10 = new Ex_10();
        e10.defInner();
    }
}
