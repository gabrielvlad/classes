package ex2.subex4;

public class BurgerBarCustomer implements Runnable {
    private final int burgersToEat;
    private final String name;
    private final BurgerBar burgerBar;

    public BurgerBarCustomer(String name, BurgerBar burgerBar, int burgersToEat) {
        this.burgersToEat = burgersToEat;
        this.name = name;
        this.burgerBar = burgerBar;
    }

    @Override
    public void run() {
        for (int i = 0; i < burgersToEat; i++) {
            burgerBar.eatBurger(name);
            try {
                Thread.sleep(3000); // simulate time to eat a burger
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

