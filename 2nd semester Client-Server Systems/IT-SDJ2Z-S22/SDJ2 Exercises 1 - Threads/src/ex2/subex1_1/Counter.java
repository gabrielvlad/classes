package ex2.subex1_1;

public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    // synchronized keyword is used here to ensure that only one thread can call this method at a time
    public synchronized void incrementCount() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

/* for the synchronised block approach
package ex2.subex1;

public class Counter {
    private int count;
    private final Object lock = new Object();  // a lock object

    public Counter() {
        count = 0;
    }

    public void incrementCount() {
        synchronized(lock) {  // only one thread can execute the code inside this block at a time
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

 */

