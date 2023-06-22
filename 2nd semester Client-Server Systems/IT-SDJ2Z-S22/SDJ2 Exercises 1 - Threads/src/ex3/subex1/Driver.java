package ex3.subex1;

public class Driver implements TrafficLightObserver {
    private Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public void onLightChange(LightColor color) {
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
                car.start();
            }
        }
    }

    public Car getCar() {
        return car;
    }
}