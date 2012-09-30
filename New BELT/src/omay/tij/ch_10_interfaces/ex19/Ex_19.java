package omay.tij.ch_10_interfaces.ex19;

import java.util.Random;

/*Create a framework using FactoryMethods that
performs both coin tossing and dice tossing.
*/
interface Toss{
    void tossing();
}
interface TossFactory{
    Toss getTossing();
}
class CoinTossing implements Toss{
   private Random rand = new Random();
    public void tossing(){
        int i = rand.nextInt(2);
        System.out.print("Coin tossing is ");
        if (i==1){
            System.out.println("heads.");
        }else {
            System.out.println("tails.");
        }

    }
}
class CoinTossingFactory implements TossFactory{
    public Toss getTossing(){
        return new CoinTossing();
    }
}
class DiceTossing implements Toss{
    private Random rand = new Random();
    public void tossing(){
        System.out.print("Dice tossing is "+(rand.nextInt(6)+1));

    }
}
class DiceTossingFactory implements TossFactory{
    public Toss getTossing(){
        return new DiceTossing();
    }
}
public class Ex_19 {
    public static void playToss(TossFactory factory){
        Toss t = factory.getTossing();
        t.tossing();
    }
    public static void main(String[]args){
        playToss(new CoinTossingFactory());
        playToss(new DiceTossingFactory());
    }
}
