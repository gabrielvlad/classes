package ex3.subex2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SleepyDriver implements PropertyChangeListener {
    private Car car;
    private LightColor previousColor;

    public SleepyDriver(Car car) {
        this.car = car;
        this.previousColor = LightColor.RED;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        LightColor color = (LightColor) evt.getNewValue();
        switch(color) {
            case GREEN -> {
                if (!car.isRunning()) car.start();
                car.accelerate();
                previousColor = color;
            }
            case YELLOW -> {
                if (previousColor == LightColor.GREEN) car.decelerate();
                previousColor = color;
            }
            case RED -> {
                previousColor = color;
            }
            case RED_YELLOW -> {
                previousColor = color;
            }
        }
    }

    public Car getCar() {
        return car;
    }
}
