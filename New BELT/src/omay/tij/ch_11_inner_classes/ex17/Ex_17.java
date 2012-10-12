package omay.tij.ch_11_inner_classes.ex17;

import java.util.Random;

/*Modify the solution to Exercise 19 from the Interfaces
chapter to use anonymous inner classes.
*/

//TODO: вот тут как раз есть пример фабрики, даже абстрактной, по этому поводу даже специфический анекдот есть:
// You have a problem and decide to use Java.
//Now you have a ProblemFactory, ProblemFactoryConfigurationManager and problem/factory/config/production.xml
//TODO: по самому упражнению - нужно использовать анонимные внутренние классы (реализующие интерфейс),
// а не обычные классы-реализации интерфейса, т.е new Toss { @Override public void tossing() { ...

interface Toss {
    void tossing();
}

interface TossFactory {
    Toss getTossing();
}

class CoinTossing implements Toss {
    private Random rand = new Random();

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

    public static TossFactory factory = new TossFactory() {
        @Override
        public Toss getTossing() {
            return new CoinTossing();
        }
    };
}

class DiceTossing implements Toss {
    private Random rand = new Random();

    @Override
    public void tossing() {
        System.out.print("Dice tossing is " + (rand.nextInt(6) + 1));

    }

    public static TossFactory factory = new TossFactory() {
        @Override
        public Toss getTossing() {
            return new DiceTossing();
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
