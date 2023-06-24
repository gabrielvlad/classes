package ex3.subex2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Pedestrian implements PropertyChangeListener {
    private LightColor previousColor;

    public Pedestrian() {
        this.previousColor = LightColor.RED;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        LightColor color = (LightColor) evt.getNewValue();
        switch(color) {
            case GREEN -> {
                System.out.println("Pedestrian waiting.");
                previousColor = color;
            }
            case YELLOW -> {
                if (previousColor == LightColor.GREEN) System.out.println("Pedestrian runs faster across the road.");
                previousColor = color;
            }
            case RED -> {
                System.out.println("Pedestrian crossing the road.");
                previousColor = color;
            }
            case RED_YELLOW -> {
                System.out.println("Pedestrian getting ready to cross.");
                previousColor = color;
            }
        }
    }
}
