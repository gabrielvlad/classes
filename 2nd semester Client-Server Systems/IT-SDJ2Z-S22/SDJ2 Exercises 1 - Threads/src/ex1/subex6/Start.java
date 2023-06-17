/*
1.6 Updating a shared object
Create a class, Counter, with a single private field variable, count, of type int. Initialized count to 0 in the
constructor.
The incrementCount method should add 1 to the count.
Create a Runnable class (a class implementing the Runnable interface), CountIncrementer, which takes a
reference to your class with the counter (an argument for the constructor of CountIncrementer).
In the run() method of CounterIncrementer, call the update method 1,000,000 times in a for-loop, so that
the ‘count’ variable in Counter is incremented. When the for-loop is done, i.e. after and outside of the for loop,
get the count variable, and print it out.
Now create a Start class with a main method. Instantiate the Counter class, instantiate one instance of
CountIncrementer, and start the Thread, something like:
Counter counter = new Counter();
CounterIncrementer incrementer = new CounterIncrementer(counter);
Thread t = new Thread(incrementer);
Verify that the number printed out is 1,000,000.
Change the code in your main method so that two CounterIncrementer threads are created and started but
use the same counter.
Two threads will now both increment the count variable 1,000,000 times, which means that the counter is
incremented 2,000,000 times. Run it a few times. Is the value always 2,000,000? (If so, you have made a
mistake.)
We’ll fix this problem next time.

Note:
The code has two CounterIncrementer threads, both trying to increment the count variable of the same Counter
object a million times each. However, because there is no synchronization mechanism in place to control the
order of execution or ensure atomicity of increment operations, the final value of count is not guaranteed to
be 2,000,000.
The program therefore is expressing a race condition situation, the definition:
A race condition is a situation where the behavior of a software system depends on the relative timing of events,
such as the order in which threads are scheduled. The problem statement hints that this is expected and the purpose
of the exercise is to understand how race conditions can occur in multi-threaded programs.
This is what it was expected since there is no synchronisation in place for the threads
So yes, the program is behaving as expected given the problem statement, and these results
illustrate the concept of a race condition in multi-threading.
*/


package ex1.subex6;
public class Start {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterIncrementer incrementer1 = new CounterIncrementer(counter);
        CounterIncrementer incrementer2 = new CounterIncrementer(counter);
        Thread t1 = new Thread(incrementer1);
        Thread t2 = new Thread(incrementer2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
