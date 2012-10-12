package omay.tij.ch_10_interfaces.ex6;

/*Prove that all the methods in an interface are
 automatically public.
 */

//TODO: тут хватило бы кода:
//TODO: done
interface Test {
    void a();
}
//TODO: к слову во второй части задания (не совсем понятно зачем ты делишь задание на две части, указано как
//можно продемонстрировать то что методы интерфейсы даже неявно являются public
//TODO.done: согласен, исправил, просто казалось, если интерфейс будет за пределом пакета - получится более наглядней

public class Ex_6 implements Test {
	public void a() {
		System.out.println("a");
	}
    public static void main(String[] args) {

	}

}

