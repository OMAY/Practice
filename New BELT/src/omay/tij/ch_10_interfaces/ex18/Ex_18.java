package omay.tij.ch_10_interfaces.ex18;

/*Create a Cycle interface, with implementations
Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle,
and code that uses these factories.
*/

//TODO: а тут фабрики нужны по условию :) фабрика это порождающий шаблон проектирования
//полагаю в книге был пример, но если что на википедии есть описание
//TODO: вроде done.?
//практически, только имя метода крайне странное для фабрики, она ведь не ездит на велосипедах, а производит их, Using в имени фабричного класса лишнее
//если просто читать код как текст на английском сейчас получается вроде "интерфейс велосипед использует фабрику", читающий будет малость в замешательстве
//если же будет CycleFactory то "фабрика велосипедов" уже говорит о большем

interface Cycle {
    void move();
}

interface CycleFactory {
    Cycle ride();
}

class Unicycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Unicycle moving");
    }
}

class UnicycleFactory implements CycleFactory {
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

class BicycleFactory implements CycleFactory {
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

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle ride() {
        return new Tricycle();
    }
}

public class Ex_18 {
    public static void ridding(CycleFactory factory) {
        Cycle c = factory.ride();
        c.move();
    }

    public static void main(String[] args) {
        ridding(new UnicycleFactory());
        ridding(new BicycleFactory());
        ridding(new TricycleFactory());
    }
}
