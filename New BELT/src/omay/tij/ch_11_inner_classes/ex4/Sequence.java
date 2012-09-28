package omay.tij.ch_11_inner_classes.ex4;
/*Add a method to the class Sequence.SequenceSelector
that produces the reference to the outer class Sequence .

 */

interface Selector{
    boolean end();
    Object current();
    void next();
}
public class Sequence{
    private Object[]items;
    private int next=0;
    public Sequence(int size){
        items=new Object[size];
    }
    public void add(Object x){
        if(next<items.length)
            items[next++]=x;
    }
    private class SequenceSelector implements Selector{
        private int i=0;
        public boolean end(){
            return i==items.length;
        }
        public Object current(){
            return items[i];
        }
        public void next(){
            if( i<items.length)i++;
        }
        public Sequence createSequence(){
            return Sequence.this;
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String[]args){
        Sequence sequence=new Sequence(10);

    }
}
