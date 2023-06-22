package ex3.subex1;

public class Pedestrian implements TrafficLightObserver {
    private LightColor previousColor;

    public Pedestrian() {
        this.previousColor = LightColor.RED;
    }

    public void onLightChange(LightColor color) {
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
