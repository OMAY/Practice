package omay.tij.ch_11_inner_classes.ex22;

/*Implement reverseSelector() in Sequence.java. */

//TODO: отлично

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length)
                i++;
        }
    }

    private class ReverseSelector implements Selector {
        private int i = items.length - 1;

        public boolean end() {
            return i < 0;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i >= 0)
                i--;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector reverseSelector() {
        return new ReverseSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector1 = sequence.selector();
        Selector selector2 = sequence.reverseSelector();
        while (!selector1.end()) {
            System.out.print(selector1.current() + " ");
            selector1.next();
        }
        System.out.println();
        while (!selector2.end()) {
            System.out.print(selector2.current() + " ");
            selector2.next();
        }

    }
}