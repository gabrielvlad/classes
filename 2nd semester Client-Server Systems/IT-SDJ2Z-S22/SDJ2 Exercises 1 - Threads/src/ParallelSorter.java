/*
REQUIREMENTS:
1.2 Runnable interface

a. Create a static method that takes a Runnable, runs it and returns the
number of milliseconds it took to run it. The method should have this signature:
public static long runAndTime(Runnable runnable) Use the runAndTime() to test the running
time of sort() and parallelSort().

b. Change the method to return the running time in nanoseconds instead (Hint: Use BigInteger).

*/

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ParallelSorter {
    private static long[] randomArray(int size) {
        Random random = new Random();
        long[] array = new long[size];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextLong();
        }
        return array;
    }

    // a.
    public static long runAndTime(Runnable runnable) {
        long start = System.currentTimeMillis();
        runnable.run();
        long end = System.currentTimeMillis();
        return end - start;
    }


    // b. Change the method to return the running time in nanoseconds instead (Hint: Use BigInteger).

    public static BigInteger runAndTime2(Runnable runnable) {
        BigInteger start = BigInteger.valueOf(System.nanoTime());
        runnable.run();
        BigInteger end = BigInteger.valueOf(System.nanoTime());
        return end.subtract(start);
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] testArray = randomArray(10_000_000);
        long[] testArrayCopy = testArray.clone();
        System.out.println("Press ENTER");
        in.nextLine();

        // Create two Runnables, one for sort and one for parallelSort
        Runnable sortRunnable = () -> Arrays.sort(testArray);
        Runnable parallelSortRunnable = () -> Arrays.parallelSort(testArrayCopy);

        //Use runAndTime to measure how long each sorting operation takes

        // a version with milliseconds
        long  sortTime = runAndTime(sortRunnable);
        System.out.println("sort() took " + sortTime + " milliseconds");

        long  parallelSortTime = runAndTime(parallelSortRunnable);
        System.out.println("parallelSort() took " + parallelSortTime + " milliseconds");

        // b version with nanoseconds
        BigInteger sortTime2 = runAndTime2(sortRunnable);
        System.out.println("sort() took " + sortTime2 + " nanoseconds");

        BigInteger parallelSortTime2 = runAndTime2(parallelSortRunnable);
        System.out.println("parallelSort() took " + parallelSortTime2 + " nanoseconds");

    }
}