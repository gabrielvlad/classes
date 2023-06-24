package ex3.subex2;

import java.beans.PropertyChangeListener;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new TrafficLight();
        Thread lightThread = new Thread(light);
        lightThread.start();
        Car carA = new Car("A");
        Car carB = new Car("B");
        PropertyChangeListener taxiDriver = new TaxiDriver(carA);
        PropertyChangeListener sleepyDriver = new SleepyDriver(carB);
        PropertyChangeListener pedestrian = new Pedestrian();
        Thread.sleep(1000);
        light.addPropertyChangeListener(taxiDriver);
        light.addPropertyChangeListener(sleepyDriver);
        Thread.sleep(2000);
        light.addPropertyChangeListener(pedestrian);
    }
}
