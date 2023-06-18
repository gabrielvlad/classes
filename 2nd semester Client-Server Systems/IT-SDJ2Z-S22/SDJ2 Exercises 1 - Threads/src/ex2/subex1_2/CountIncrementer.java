package ex2.subex1_2;

class CountIncrementer implements Runnable {
    private final Counter counter;

    public CountIncrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            counter.incrementDooku();
            counter.incrementDracula();
        }
    }
}