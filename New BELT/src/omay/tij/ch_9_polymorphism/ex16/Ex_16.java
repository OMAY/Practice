package omay.tij.ch_9_polymorphism.ex16;

/*Following the example in Transmogrify.Java, create a 
 Starship class containing an AlertStatus reference that can indicate three 
 different states. Include methods to change the states.  */

//TODO: use @Override annotation
//TODO: done

class AlertStatus {
	public String alert() {
		return "Alert";
	}

}

class FirstStageAlert extends AlertStatus {

    @Override
	public String alert() {
		return "FirstStageAlert";
	}
}

class SecondStageAlert extends AlertStatus {

    @Override
	public String alert() {
		return "SecondStageAlert";
	}
}

class ThirdStageAlert extends AlertStatus {

    @Override
	public String alert() {
		return "ThirdStageAlert";
	}
}

class StarShip {
	private AlertStatus alStatus = new AlertStatus();

	public void showStatus() {
		System.out.println(alStatus.alert());
	}

	public void changeStatus(AlertStatus status) {
		alStatus = status;
	}
}

public class Ex_16 {
	public static void main(String[] args) {
		StarShip ship = new StarShip();
		ship.showStatus();
		ship.changeStatus(new FirstStageAlert());
		ship.showStatus();
		ship.changeStatus(new SecondStageAlert());
		ship.showStatus();
		ship.changeStatus(new ThirdStageAlert());
		ship.showStatus();
	}
}