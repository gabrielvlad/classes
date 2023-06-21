/*
2.3.1 (Extra: Simulating the temperature in a room – two thermometers)
Modify the previous exercise to include two thermometers in different positions from a heater
Modify class Thermometer:
• An extra instance variable, d, of type int
• The constructor taking also d as argument to initialise this one too
• Use the variable d as argument when calling temperature in the run method
• Keep the value p=2 (i.e. a heater’s power position is 2) when calling temperature
Modify the main method:
• Create two Thermometerobjects, one with d=1 and one with d=7. Give different ids for the two.
• Create two threads and start both.
Run the application and observe that the temperature raises faster for the thermometer with distance d=1
that the one with distance d=7 (in other words, that the thermometer closest to the heater reacts faster
and is less dependent on the outdoor temperature)
*/
package ex2.subex3_1;

public class Main {
    public static void main(String[] args) {
        Thermometer thermometer1 = new Thermometer("t1", 15, 1);
        Thermometer thermometer2 = new Thermometer("t2", 15, 7);
        Thread thread1 = new Thread(thermometer1);
        Thread thread2 = new Thread(thermometer2);
        thread1.start();
        thread2.start();
    }
}
