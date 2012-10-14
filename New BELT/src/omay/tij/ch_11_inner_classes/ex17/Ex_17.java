package omay.tij.ch_11_inner_classes.ex17;

import java.util.Random;

/*Modify the solution to Exercise 19 from the Interfaces
chapter to use anonymous inner classes.
*/

//TODO: по самому упражнению - нужно использовать анонимные внутренние классы (реализующие интерфейс),
// а не обычные классы-реализации интерфейса, т.е new Toss { @Override public void tossing() { ...
//TODO: done.?
//TODO:не совсем, в 16-м шла речь о том же, поэтому желательно поработать над этим упражнением уже после 16-го
//абстрактные фабрики нам тут вообще-то не нужны, метод фабрики тоже не обязан быть статическим, иначе не во всём коде
//тут будет смысл (будто его принятули за уши), лучше ориентироваться на 19-е из 10-й главы и 16-е из 11-й.
//вообще тут многое мне нравится, только фабрика не должна быть абстрактной, фабричный метод может остаться статическим
//если у тебя такое видение решения (тут ничего ошибочного нет, т.к. чётких требований в этом плане тоже нет и этот
//момент (статический фабричный метод или нет) в общем на выбор разработчика), в принципе можно посмотреть ещё:
// http://ru.wikipedia.org/wiki/%D0%A4%D0%B0%D0%B1%D1%80%D0%B8%D0%BA%D0%B0_%28%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F%29#Java

interface Toss {
    void tossing();
}

interface TossFactory {
    Toss getTossing();
}

abstract class CoinTossing implements Toss {
    private static Random rand = new Random();

    public static TossFactory factory = new TossFactory() {
        @Override
        public Toss getTossing() {
            return new Toss() {
                @Override
                public void tossing() {
                    int i = rand.nextInt(2);
                    System.out.print("Coin tossing is ");
                    if (i == 1) {
                        System.out.println("heads.");
                    } else {
                        System.out.println("tails.");
                    }
                }
            };
        }
    };
}

abstract class DiceTossing implements Toss {
    private static Random rand = new Random();
    public static TossFactory factory = new TossFactory() {
        @Override
        public Toss getTossing() {
            return new Toss() {
                @Override
                public void tossing() {
                    System.out.print("Dice tossing is " + (rand.nextInt(6) + 1));
                }
            };
        }
    };

}
public class Ex_17 {
    public static void playToss(TossFactory factory) {
        Toss t = factory.getTossing();
        t.tossing();
    }

    public static void main(String[] args) {
        playToss(CoinTossing.factory);
        playToss(DiceTossing.factory);
    }
}
