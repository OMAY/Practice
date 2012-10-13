package omay.tij.ch_11_inner_classes.ex15;

/*Create a class with a non-default constructor (one with
arguments) and no default constructor (no "no-arg" constructor). Create a
second class that has a method that returns a reference to an object of the
first class. Create the object that you return by making an anonymous inner
class that inherits from the first class. */

class Class1 {
    public Class1(int i) {
        printMe(i);
    }

    public void printMe(int i) {
        System.out.println("A new object of Class1 with arg = " + i);
    }
}

class Class2 {
    public Class1 create1(int i) {
        //TODO: тут не хватало фигурных скобок, т.к. без них ты просто создавал экземпляр Class1, а с ними - экземпляр
        //анонимного класса, советую найти в папке с проектом байткод (.class), тогда ты увидишь что для анонимных
        //классов тоже создаются свои файлы с байткодом и у них (анонимных классов) на самом деле есть имена, правда
        //обращаться по этим именам нет смысла.
        //TODO: это которые Class2$1 и Class2$2   ?
        return new Class1(i) {};
    }

    public Class1 create2(int i) {
        return new Class1(i) {
            @Override
            public void printMe(int i) {
                System.out.println("A new object of Class1 with arg = " + i +
                        " created by overriding method in inner class");
            }
        };
    }
}

public class Ex_15 {
    public static void main(String[] args) {
        int a = 28;
        Class2 class2 = new Class2();
        Class1 class1 = class2.create1(a);
        class1 = class2.create2(a);
    }
}
