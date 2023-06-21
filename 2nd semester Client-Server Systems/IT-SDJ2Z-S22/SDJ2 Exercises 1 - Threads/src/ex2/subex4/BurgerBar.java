package ex2.subex4;

public class BurgerBar {
    private int numberOfBurgers;
    private final int maxNumberOfBurgers;

    public BurgerBar(int maxNumberOfBurgers) {
        this.maxNumberOfBurgers = maxNumberOfBurgers;
        this.numberOfBurgers = 0;
    }

    public synchronized void makeBurger(String employeeName) {
        while (numberOfBurgers >= maxNumberOfBurgers) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numberOfBurgers++;
        System.out.println(employeeName + " has made a burger. Number of burgers now: " + numberOfBurgers);
        notifyAll();
    }

    public synchronized void eatBurger(String customerName) {
        while (numberOfBurgers <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numberOfBurgers--;
        System.out.println(customerName + " has eaten a burger. Number of burgers now: " + numberOfBurgers);
        notifyAll();
    }

    public synchronized int getNumberOfBurgers() {
        return numberOfBurgers;
    }
}

