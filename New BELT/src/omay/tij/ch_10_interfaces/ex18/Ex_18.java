package omay.tij.ch_10_interfaces.ex18;

/*Create a Cycle interface, with implementations
Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle,
and code that uses these factories.
*/

interface Cycle {
    void move();
}

//TODO: factory в имени интерфейса как-то не вяжется с тем что он делает, фабрики служат для создания объектов
//в следующем упражнении в этом плане ошибки нет
interface CycleFactory {
    Cycle ride();
}

class Unicycle implements Cycle {
    public void move() {
        System.out.println("Unicycle moving");
    }
}

class UnicycleFactory implements CycleFactory {
    public Cycle ride() {
        return new Unicycle();

    }
}

class Bicycle implements Cycle {
    public void move() {
        System.out.println("Bicycle moving");
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle ride() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    public void move() {
        System.out.println("Tricycle moving");
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle ride() {
        return new Tricycle();
    }
}

public class Ex_18 {
    public static void ridding(CycleFactory cycleFactory) {
        Cycle c = cycleFactory.ride();
        c.move();
    }

    public static void main(String[] args) {
        ridding(new UnicycleFactory());
        ridding(new BicycleFactory());
        ridding(new TricycleFactory());
    }
}
