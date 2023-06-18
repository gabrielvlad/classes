/*
2.1.1 1 counter
Implement the counter increment exercise from last time:
A counter class containing a count field variable of type int. Include a method to increment the variable by
one: count++, and a method to return the count.
A Runnable class with a reference to the counter class, which invokes the increment method 1.000.000
times. At the end get the count variable and print it out.
Create a Start class with a main method, instantiate a counter class, and two threads to increment the
counter.
Verify that the count variable is not 2.000.000.
Synchronize the code so that you get the result, you expect. Run it a couple of times, to be sure you weren't
just lucky.
Try both with synchronizing the method and using the synchronized block approach.
*/
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

