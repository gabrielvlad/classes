package ex2.subex3;

public class Main {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer("t1", 15);
        Thread thread = new Thread(thermometer);
        thread.start();
    }
}
