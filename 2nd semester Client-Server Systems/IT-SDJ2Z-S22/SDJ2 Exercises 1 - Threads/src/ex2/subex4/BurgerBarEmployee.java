package ex2.subex4;

public class BurgerBarEmployee implements Runnable {
    private final String name;
    private final BurgerBar burgerBar;

    public BurgerBarEmployee(String name, BurgerBar burgerBar) {
        this.name = name;
        this.burgerBar = burgerBar;
    }

    @Override
    public void run() {
        while (true) {
            burgerBar.makeBurger(name);
            try {
                Thread.sleep(2000); // simulate time to make a burger
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
