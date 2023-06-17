/*
1.3 Print letters and numbers
Copy the classes Numbers, Letters and Start from https://github.com/olehougaard/sdj2-
s22/tree/master/session1.
Run the program from the Start class, and check the console to see that numbers and letters are
alternately printed.
You may see that a lot of numbers are printed, and then letters are printed, and then numbers again, and
so forth. Can you explain why this would happen?

Answer:
There are 2 threads to print letters and numbers concurrently. Due to the
nature of concurrency, they appear to print in an alternating pattern,
but the exact order is not predictable and depends on the thread scheduling
done by the JVM and the operating system. The start() method is used to begin
the execution of these threads, and join() is used to make the main thread wait
until these printing tasks have completed. Only after these threads have ended
their execution does the program print 'Finished'.

*/
package ex1.subex3;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Numbers();
        Runnable r2 = new Characters();
        Thread t = new Thread(r);
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
        t.join();
        t2.join();
        System.out.println("Finished");
    }
}
