/*
This one is just a template to try the equivalent of Javadocs in C#
*/
namespace S1_Ex5._3.MathLib;
/// <summary>
/// Calculator object made to be called by the constructor program, and initialize the instance variables that I am adding to it
/// </summary>
public class Calculator
{
    /// <summary>
    /// Create an Add method in the calculator that takes two numbers and returns their sum. Use it in the Main method of Program.cs.
    /// Add method attached to the Calculator object class
    /// </summary>
    /// <param name="x"></param>
    /// <param name="y"></param>
    /// <returns>"x+y"</returns>
    public int Add(int x, int y)
    {
        return x + y;
    }
 
    //Add an overload method for Add that takes an array of integers, adds them together, then returns the result. Use the for-each loop.
    public int Add(int[] ints)
    {
        int res = 0; //You can declare the variable as var and the compiler will automatically change it ot the right data type o you can write it
        //as int and therefore make the code more readable, according to google is no performance difference.
        foreach (var n in ints)
        {
            res += n;
        }

        return res;
    }
    
}