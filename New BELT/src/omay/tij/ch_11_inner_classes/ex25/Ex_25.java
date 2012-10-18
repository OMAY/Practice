package omay.tij.ch_11_inner_classes.ex25;

/*Inherit from GreenhouseControls in GreenhouseControls.Java
to add Event inner classes that turn water mist generators on and off.
Write a new version of GreenhouseController.java to use these new Event objects. */

//TODO: хорошо, последние упражнения наверное несколько утомили, можно было бы придумать что-то более интересное

import omay.tij.ch_11_inner_classes.ex24.*;
import omay.tij.ch_11_inner_classes.ex24.controller.Event;

class GreenhouseControls2 extends GreenhouseControls {
    private boolean waterMistGenerator = false;

    public class WaterMistGeneratorOn extends Event {
        public WaterMistGeneratorOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            waterMistGenerator = true;
        }

        public String toString() {
            return "WaterMistGenerator is on";
        }
    }

    public class WaterMistGeneratorOff extends Event {
        public WaterMistGeneratorOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            waterMistGenerator = false;
        }

        public String toString() {
            return "WaterMistGenerator is off";
        }
    }
}

public class Ex_25 {
    public static void main(String[] args) {
        GreenhouseControls2 gc2 = new GreenhouseControls2();
        gc2.addEvent(gc2.new Bell(900));
        Event[] eventList = {
                gc2.new ThermostatNight(10),
                gc2.new FansOn(100),
                gc2.new FansOff(200),
                gc2.new LightOn(300),
                gc2.new LightOff(400),
                gc2.new WaterOn(600),
                gc2.new WaterOff(800),
                gc2.new WaterMistGeneratorOn(900),
                gc2.new WaterMistGeneratorOff(1000),
                gc2.new ThermostatDay(1400)
        };
        gc2.addEvent(gc2.new Restart(1, eventList));
        if (args.length == 1)
            gc2.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        gc2.run();
    }
}
