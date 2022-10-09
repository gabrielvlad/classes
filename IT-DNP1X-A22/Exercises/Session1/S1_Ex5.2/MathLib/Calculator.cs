/*
Add to the Calculator class from the previous exercise and method that 
takes two number inputs from the console and then displays the maximum of the two. 
Call the method from the main method. (hint: use the Console.ReadLine() method).
 */

/*
 I rewrote it again, since it is necessary for Ex6, this time I have learned that 
 having the same method with 2 different arguments is called an
 overload method
 
 Definition here:
 Overloading happens when you have two methods with the same name but different 
 signatures (or arguments). In a class we can implement two or more methods with 
 the same name. Overloaded methods are differentiated based on the number and type 
 of parameter passed as arguments to the methods.
 */
namespace S1_Ex5._2.MathLib;

public class Calculator
{
    //Create an Add method in the calculator that takes two numbers and returns their sum. Use it in the Main method of Program.cs.
    public int Add(int x, int y)
    {
        return x + y;
    }

    //Add an overload method for Add that takes an array of integers, adds them together, then returns the result. Use the for-each loop.
    public int Add(int[] ints)
    {
        int
            res = 0; //You can declare the variable as var and the compiler will automatically change it ot the right data type o you can write it
        //as int and therefore make the code more readable, according to google is no performance difference.
        foreach (var n in ints)
        {
            res += n;
        }

        return res;
    }
}