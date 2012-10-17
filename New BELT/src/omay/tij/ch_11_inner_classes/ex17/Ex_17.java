package omay.tij.ch_11_inner_classes.ex17;

import java.util.Random;

/*Modify the solution to Exercise 19 from the Interfaces
chapter to use anonymous inner classes.*/

//TODO: я реализовал один из вариантов того что можно понимать под этим заданием
//если что можно позже откатить изменения, на то они и системы контроля версий

interface Toss {
    void tossing();
}

interface TossFactory {
    Toss getTossing();
}

class CoinTossingFactory implements TossFactory{
    private static Random rand = new Random();

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
}

class DiceTossingFactory implements TossFactory{
    private static Random rand = new Random();

    @Override
    public Toss getTossing() {
        return new Toss() {
            @Override
            public void tossing() {
                System.out.print("Dice tossing is " + (rand.nextInt(6) + 1));
            }
        };
    }
}

public class Ex_17 {
    public static void playToss(Toss t) {
        t.tossing();
    }

    public static void main(String[] args) {
        playToss(new CoinTossingFactory().getTossing());
        playToss(new DiceTossingFactory().getTossing());
    }
}
