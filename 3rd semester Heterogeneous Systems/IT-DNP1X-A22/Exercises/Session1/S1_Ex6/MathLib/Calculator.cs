/*
Add to the Calculator class from the previous exercise and method that 
takes two number inputs from the console and then displays the maximum 
of the two. Call the method from the main method.
(hint: use the Console.ReadLine() method).
*/
//using static System.Int32; so we are using the static type of the object System 
//with it's method Int32 (just means it can use integer(whole numbers) 
//from -2,147,483,648 to +2,147,483,647)
using static System.Int32;
namespace S1_Ex6.MathLib; //just the address where it is.
/// <summary>
/// Calculator Object blueprint, it has the following methods, named Max
/// </summary>
public class Calculator
{/// <summary>
 /// Max method, it will read from keyboard integers that are written, and will compare 
 ///them and say with one is the largest number
 /// </summary>
 /*
    Method Max can be written as static compared to what the teacher showed us, because it does not have to access any instance variables
    Member 'Max' does not access instance data and can be marked as static
    Method 'Max' can be made static
  */
 public void Max()//Public comes first as the access type of the method, 
 //than it could be "static" as in "public static void" but that would just lock it to class object Calculator, and would required
 //to be called from the constructor "Program" using full address of the method, like in "Calculator.Max()", making creating a new variable
 //and storing it there than initialize it as a new instance, than calling that new object with this method, impossible.
 //Is void meaning it was build to not return anything
 //than is "Max" the name of the method, than is "()" with symbolises it is a method.
        {
        Console.WriteLine("Type first number:");
        /*
        TryParse(Console.ReadLine(), out var x); 
        "TryParse(object.method, out var name)" is a System.Int32 method
        and is used to Converts the string representation of a number to 
        its 32-bit signed integer equivalent. A return value indicates 
        whether the operation succeeded.
        Syntax example:
        public static bool TryParse (string? s, out int result);
        */
        TryParse(Console.ReadLine(), out var x);
        
        Console.WriteLine("Type second number:");
        TryParse(Console.ReadLine(), out var y);
        //Interpolation with $ used to combine the text with the Math.Max object and method
        //the method will take as variables to initialize in this context the variable x and y
        Console.WriteLine($"The largest number is: {Math.Max(x, y)}");
    }
 
 
}