package ex3.subex1;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight implements Runnable {
    private List<TrafficLightObserver> observers = new ArrayList<>();
    private LightColor color = LightColor.GREEN;

    public synchronized void addObserver(TrafficLightObserver observer) {
        observers.add(observer);
        observer.onLightChange(color);
    }

    public synchronized void removeObserver(TrafficLightObserver observer) {
        observers.remove(observer);
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                color = color.next();
                synchronized (this) {
                    notifyObservers();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void notifyObservers() {
        for (TrafficLightObserver observer : observers) {
            observer.onLightChange(color);
        }
    }
}
