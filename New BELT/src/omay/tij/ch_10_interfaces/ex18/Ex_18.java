package omay.tij.ch_10_interfaces.ex18;

/*Create a Cycle interface, with implementations
Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle,
and code that uses these factories.
*/

interface Cycle {
    void move();
}

interface CycleFactory {
    Cycle makeCycle();
}

class Unicycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Unicycle moving");
    }
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle makeCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Bicycle moving");
    }
}

class BicycleFactory implements CycleFactory {
    @Override
    public Cycle makeCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Tricycle moving");
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle makeCycle() {
        return new Tricycle();
    }
}

public class Ex_18 {
    public static void ridding(CycleFactory factory) {
        Cycle c = factory.makeCycle();
        c.move();
    }

    public static void main(String[] args) {
        ridding(new UnicycleFactory());
        ridding(new BicycleFactory());
        ridding(new TricycleFactory());
    }
}
