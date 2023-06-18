package ex2.subex1_1;

public class CounterIncrementer implements Runnable {
    private Counter counter;

    public CounterIncrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            counter.incrementCount();
        }
        System.out.println(counter.getCount());
    }
}

