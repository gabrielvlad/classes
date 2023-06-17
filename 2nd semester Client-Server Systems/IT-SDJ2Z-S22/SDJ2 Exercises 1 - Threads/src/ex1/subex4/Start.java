/*
1.4 Constructors
The purpose of this exercise is to see how a thread can receive information through its constructor.
Make a copy of exercise 1, the one which prints numbers and letters. Modify the code so that the
constructor each Runnable class takes a parameter, which determines how many numbers/letters to print
out. Currently it’s hardcoded to 10. You should be able to instantiate the threads similar to this:
Thread numPrint = new Thread(new Numbers(57));
Thread letPrint = new Thread(new Letters(33));


*/
package ex1.subex4;
public class Start {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Numbers(57);
        Runnable r2 = new Characters(33);
        Thread t = new Thread(r);
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
        t.join();
        t2.join();
        System.out.println("Finished");
    }
}