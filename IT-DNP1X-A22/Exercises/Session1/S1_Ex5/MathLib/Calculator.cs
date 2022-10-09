/*
Create a Calculator class and put it in it's own MathLib namespace. Optionally, create a separate folder for this class.
Create an Add method in the calculator that takes two numbers and returns their sum. Use it in the Main method of Program.cs.
Add an overload method for Add that takes an array of integers, adds them together, then returns the result. Use the for-each loop.
Use this overload method in the Main method of the program.
Print out the results. 
*/

/*Understanding namespaces
If you organize the code with directories inside the console application, then you must specify where it is(basically the path)
that is done using a namespace keyword like this: " namespace Namespace-Name ", than use that namespace in the constructor 
by saying "using Namespace-Name" in this case S1_Ex5 is the console application and .MathLib is the directory
so it would be: " using S1_Ex5.MathLib " in this case;
*/
namespace S1_Ex5.MathLib;

//Is a class because it does not have the "()" and you must do this when you create any blueprint logic for the constructor to use.
public class Calculator
{
    //I was surprised you can have the same name " Add " so to my understanding it acts like an extension so you can have different logic
    //the first Add is doing the math variable x + y is returned and created in the " () "
    public int Add(int x, int y)
    {
        return x + y;
    }

    //The second Add is creating an array in the "()" named ints than it creates a variable res and it assigns it the value of 0
    public int Add(int[] ints)
    {
        var res = 0;
        
        //Google definition:What is forEach used for?
        //Definition and Usage. The forEach() method calls a function for each element in an array.
        
        //My notes trying to understand the logic: so is a loop that goes in
        //and for each variable n value that you give to the array ints is being being called than the new value of variable res would become the last value
        //that entered the ints array and was calculated, the foreach loop stops at the last value you insert in the array.
        foreach (var n in ints)
        {
            //res = res + n; //+= Add AND assignment operator, It adds right operand to the left operand and assign the result to left operand.
            res += n; //res += n is equivalent to res = res + n so the logic is 0 + n in the array return 0
        }
        return res;
    }
}