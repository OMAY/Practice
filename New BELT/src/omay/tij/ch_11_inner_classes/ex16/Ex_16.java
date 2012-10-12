package omay.tij.ch_11_inner_classes.ex16;

/*Modify the solution to Exercise18 from the Interfaces
chapter to use anonymous innerclasses.
*/

//TODO: 18-е в интерфейсах нужно переделать, поэтому и данное упражнение понадобится переделать по изменившемуся 18-му

interface Cycle {
    void move();
}

interface CycleUsing {
    Cycle ride();
}

class Unicycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Unicycle moving");
    }

    public static CycleUsing using = new CycleUsing() {
        @Override
        public Cycle ride() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Bicycle moving");
    }

    public static CycleUsing using = new CycleUsing() {
        @Override
        public Cycle ride() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Tricycle moving");
    }

    public static CycleUsing using = new CycleUsing() {
        @Override
        public Cycle ride() {
            return new Tricycle();
        }
    };
}

public class Ex_16 {
    public static void ridding(CycleUsing cycleUsing) {
        Cycle c = cycleUsing.ride();
        c.move();
    }

    public static void main(String[] args) {
        ridding(Unicycle.using);
        ridding(Bicycle.using);
        ridding(Tricycle.using);
    }
}

