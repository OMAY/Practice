package omay.tij.ch_11_inner_classes.ex16;

/*Modify the solution to Exercise18 from the Interfaces
chapter to use anonymous inner classes.
*/

//TODO: 18-е в интерфейсах нужно переделать, поэтому и данное упражнение понадобится переделать по изменившемуся 18-му
//TODO: done.
//TODO: тоже нужно поправить имена, в плане анонимный внутренних классов мне тоже не совсем нравится:
//чтобы оправдать использование внутренних классов, можно сделать так: интерфейс для сущности,
//и фабрики (не абстрактные, абстрактные классы могут использовать только когда в них могут быть абстрактные методы либо
// как средство, весьма спорное, т.к. это лучше сделать иными средствами, запретить создание экземпляров этого класса)
//, в которых есть методы типа createUnicycle и т.д. (в зависимости от фабрики), где
//создаётся анонимный внутренний класс по сути реализующий интерфейс Cycle (не явным видом конечно, без implements:

/*interface Something {
    void doSomething();
}
class SomethingGoodFactory {
    public Something produceSomethingGood() {
        return new Something() {
            @Override
            public void doSomething() {
                System.out.println("Doing something good");
            }
        };
    }
}
class SomethingBadFactory {
    public Something produceSomethingBad() {
        return new Something() {
            @Override
            public void doSomething() {
                System.out.println("Doing something bad");
            }
        };
    }
}*/


interface Cycle {
    void move();
}

interface CycleUsing {
    Cycle ride();
}

abstract class Unicycle implements Cycle {
    public static CycleUsing using = new CycleUsing() {
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
    public static CycleUsing using = new CycleUsing() {
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
    public static CycleUsing using = new CycleUsing() {
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
    public static void ridding(CycleUsing cycleUsing) {
        Cycle c = cycleUsing.ride();
        c.move();
    }

    public static void main(String[] args) {
        ridding(Unicycle.using);
        ridding(Bicycle.using);
        ridding(Tricycle.using);
        /*new SomethingGoodFactory().produceSomethingGood().doSomething();
        new SomethingBadFactory().produceSomethingBad().doSomething();*/
    }
}

