package omay.tij.ch_11_inner_classes.ex16;

/*Modify the solution to Exercise18 from the Interfaces
chapter to use anonymous inner classes.
*/

//TODO: 18-е в интерфейсах нужно переделать, поэтому и данное упражнение понадобится переделать по изменившемуся 18-му
//TODO: done.
interface Cycle {
    void move();
}
interface CycleFactory {
    Cycle ride();
}
abstract class Unicycle implements Cycle {
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle ride() {
            return new Unicycle(){
                @Override
                public void move() {
                    System.out.println("Unicycle moving");
                }
            };
        }
    };
}
abstract class Bicycle implements Cycle {
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle ride() {
            return new Bicycle(){
                @Override
                public void move() {
                    System.out.println("Bicycle moving");
                }
            };
        }
    };
}
abstract class Tricycle implements Cycle {
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle ride() {
            return new Tricycle(){
                @Override
                public void move() {
                    System.out.println("Tricycle moving");
                }
            };
        }
    };
}
public class Ex_16 {
    public static void ridding(CycleFactory cycleFactory) {
        Cycle c = cycleFactory.ride();
        c.move();
    }

    public static void main(String[] args) {
        ridding(Unicycle.factory);
        ridding(Bicycle.factory);
        ridding(Tricycle.factory);
    }
}

