package ex3.subex1;

public class SleepyDriver implements TrafficLightObserver {
    private Car car;
    private LightColor previousColor;

    public SleepyDriver(Car car) {
        this.car = car;
        this.previousColor = LightColor.RED;
    }

    public void onLightChange(LightColor color) {
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
