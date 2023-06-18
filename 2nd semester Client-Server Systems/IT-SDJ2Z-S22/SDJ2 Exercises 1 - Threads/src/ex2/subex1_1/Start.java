package ex2.subex1_1;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(new CounterIncrementer(counter));
        Thread t2 = new Thread(new CounterIncrementer(counter));

        t1.start();
        t2.start();

        // ensure both threads have finished before printing out the final count
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}

