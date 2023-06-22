package ex3.subex1;

public class TaxiDriver implements TrafficLightObserver {
    private Car car;
    private LightColor previousColor;

    public TaxiDriver(Car car) {
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
                previousColor = color;
            }
            case RED -> {
                car.stop();
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
