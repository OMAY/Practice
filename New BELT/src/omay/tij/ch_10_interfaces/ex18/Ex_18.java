package omay.tij.ch_10_interfaces.ex18;

/*Create a Cycle interface, with implementations
Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle,
and code that uses these factories.
*/

//TODO: а тут фабрики нужны по условию :) фабрика это порождающий шаблон проектирования
//полагаю в книге был пример, но если что на википедии есть описание
//TODO: вроде done.?

interface Cycle {
    void move();
}

interface CycleUsingFactory {
    Cycle ride();
}

class Unicycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Unicycle moving");
    }
}

class UnicycleUsing implements CycleUsingFactory {
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

class BicycleUsing implements CycleUsingFactory {
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

class TricycleUsing implements CycleUsingFactory {
    @Override
    public Cycle ride() {
        return new Tricycle();
    }
}

public class Ex_18 {
    public static void ridding(CycleUsingFactory factory) {
        Cycle c = factory.ride();
        c.move();
    }

    public static void main(String[] args) {
        ridding(new UnicycleUsing());
        ridding(new BicycleUsing());
        ridding(new TricycleUsing());
    }
}
