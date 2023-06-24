package ex3.subex2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TaxiDriver implements PropertyChangeListener {
    private Car car;

    public TaxiDriver(Car car) {
        this.car = car;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        LightColor color = (LightColor) evt.getNewValue();
        switch(color) {
            case GREEN -> {
                if (!car.isRunning()) car.start();
                car.accelerate();
            }
            case YELLOW -> {
                car.decelerate();
            }
            case RED -> {
                car.stop();
            }
            case RED_YELLOW -> {
                if (!car.isRunning()) car.start();
            }
        }
    }

    public Car getCar() {
        return car;
    }
}
