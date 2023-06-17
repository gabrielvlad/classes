/*
1.5 Thread serialization using join
Create a Runnable class, the constructor should take two int parameters, e.g. x and y. The class should then
print out the numbers from x to y.
In a main method create four instances of your Runnable class, and start Threads. One instance should
print numbers from 0-25000, the next 25000 -50000, the next 50000-75000 and so on.
Are the numbers printed in ascending sequence?
Modify your code to use the join functionality to make sure that the numbers printed are always in
ascending sequence.

Answer:
I have created a Numbers class and a Start main class, then I gave the range of numbers to the
Numbers class constructor, after modifying it to take x and y and introducing this x and y in
the loop that it uses, afterwards I modified the Start main class to start the treads with t.start()
and wait after each thread with t.join() so the numbers are printed in an ascending sequence.
*/


package ex1.subex5;
public class Start {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Numbers(0, 25000);
        Runnable r2 = new Numbers(25000, 50000);
        Runnable r3 = new Numbers(50000, 75000);
        Runnable r4 = new Numbers(75000, 100000);
        Thread t = new Thread(r);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);

        System.out.println("Started");
        t.start();
        t.join();

        System.out.println("Next set2");
        t2.start();
        t2.join();

        System.out.println("Next set3");
        t3.start();
        t3.join();

        System.out.println("Next set4");
        t4.start();
        t4.join();

        System.out.println("Finished all 4 sets");
    }
}