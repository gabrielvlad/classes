package ex2.subex1_2;

class Counter {
    private int countDooku = 0;
    private int countDracula = 0;
    private final Object lockDooku = new Object();
    private final Object lockDracula = new Object();

    public void incrementDooku() {
        synchronized (lockDooku) {
            countDooku++;
        }
    }

    public void incrementDracula() {
        synchronized (lockDracula) {
            countDracula++;
        }
    }

    public int getCountDooku() {
        synchronized (lockDooku) {
            return countDooku;
        }
    }

    public int getCountDracula() {
        synchronized (lockDracula) {
            return countDracula;
        }
    }
}