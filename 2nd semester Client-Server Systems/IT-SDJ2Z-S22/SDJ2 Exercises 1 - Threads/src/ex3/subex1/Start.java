package ex3.subex1;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new TrafficLight();
        Thread lightThread = new Thread(light);
        lightThread.start();
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");
        TaxiDriver taxiDriver = new TaxiDriver(carA);
        SleepyDriver sleepyDriver = new SleepyDriver(carB);
        Pedestrian pedestrian = new Pedestrian();
        Thread.sleep(1000);
        light.addObserver(taxiDriver);
        light.addObserver(sleepyDriver);
        Thread.sleep(2000);
        light.addObserver(pedestrian);
    }
}
