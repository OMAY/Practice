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
//TODO: done.?
interface CycleUsing {
    Cycle ride();
}

class Unicycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Unicycle moving");
    }
}

class UnicycleUsing implements CycleUsing {
    @Override
    public Cycle ride() {
        return new Unicycle();

    }
}

class Bicycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Bicycle moving");
    }
}

class BicycleUsing implements CycleUsing {
    @Override
    public Cycle ride() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Tricycle moving");
    }
}

class TricycleUsing implements CycleUsing {
    @Override
    public Cycle ride() {
        return new Tricycle();
    }
}

public class Ex_18 {
    public static void ridding(CycleUsing cycleUsing) {
        Cycle c = cycleUsing.ride();
        c.move();
    }

    public static void main(String[] args) {
        ridding(new UnicycleUsing());
        ridding(new BicycleUsing());
        ridding(new TricycleUsing());
    }
}
