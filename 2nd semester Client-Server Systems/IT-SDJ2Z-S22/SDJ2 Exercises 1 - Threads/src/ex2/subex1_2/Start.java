/*
2.1.2 2 counters
Implement the previous counter example, but this time with two count field variables, countDooku and
countDracula.
Create your own objects to synchronize the critical code as shown in the session code.
Create a couple of threads to update the two counters (either a thread updates one or both counters,
that’s up to you). Verify the output is as expected.

Note:
This exercise is essentially the same as the one with 1 counter but this time it has 2 counters
I have created countDooku and countDracule
Each counter has its own lock object for syncronization as lockDooku and lockDracula
The `incrementDooku()` and `incrementDracula()` methods each increment their respective counter in
a synchronized block, ensuring that only one thread can increment the counter at a time.
The countIncrementer class than implements the Runnable and increments both counters 1 million
times in its run() method
The Start class finally creates a Counter with two CountIncrementer threads that operate the same
Counter, after both threads have completed the final counts are printed out. The output is as expected
2 million for each count.
*/
package ex2.subex1_2;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(new CountIncrementer(counter));
        Thread t2 = new Thread(new CountIncrementer(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Dooku Count: " + counter.getCountDooku());
        System.out.println("Dracula Count: " + counter.getCountDracula());
    }
}