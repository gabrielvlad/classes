/*
2.2 Synchronized list
• Create a class, ListContainer. It has a private field of type List<Integer>, instantiate it as
ArrayList<Integer>.
• Create a method, add(int i), which add the integer to the List.
• Create a method to get the length of the List.
• Ignore synchronization for now.
Create a Runnable class, which has a reference to the ListContainer. It should insert the numbers from 0 to
100000 into the ListContainer. Then print out the count.
In a main method, create 2 threads to run two instances of your Runnable class.
Do you get the printed count, you expect?
Implement synchronization.
*/
package ex2.subex2;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        ListContainer listContainer = new ListContainer();

        Thread t1 = new Thread(new ListRunnable(listContainer));
        Thread t2 = new Thread(new ListRunnable(listContainer));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + listContainer.getSize());
    }
}

