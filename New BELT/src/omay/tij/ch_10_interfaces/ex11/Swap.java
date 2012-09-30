package omay.tij.ch_10_interfaces.ex11;

public class Swap {

    public static String swap(String s){
        char []ch = s.toCharArray();
        for (int i = 0;i<ch.length;i+=2){
            char temp;
            temp = ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
        }
        return new String(ch);

    }
    public static void main(String[]args){
        System.out.println(swap("String"));
    }

}
