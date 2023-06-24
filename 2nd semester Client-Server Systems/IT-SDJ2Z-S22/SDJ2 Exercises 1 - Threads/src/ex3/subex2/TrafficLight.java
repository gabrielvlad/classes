package ex3.subex2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import static ex3.subex2.LightColor.GREEN;

public class TrafficLight implements Runnable, PropertyChangeSubject {
    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    private LightColor color = GREEN;

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
        listener.propertyChange(new PropertyChangeEvent(this, "color", null, color));
    }


    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                LightColor oldColor = color;
                color = color.next();
                support.firePropertyChange("color", oldColor, color);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
