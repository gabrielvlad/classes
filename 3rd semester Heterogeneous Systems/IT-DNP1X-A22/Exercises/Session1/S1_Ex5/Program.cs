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
using S1_Ex5.MathLib;

//variable c use Calculator method:
var c = new Calculator();
// x assigned 2 value, y assigned 2 value return x+y so is 4;
Console.WriteLine(c.Add(2,2));
//formula: res += n is equivalent to res = res + n ( res is assigned the value of 0)
//Get in the array 1,2,3 as integers, than 1 is the new value of n in the array than it returns res, so 0+1 = 1, 1 is the new value
// 2 + 1 = 3, 3 is the new value, 3+3 = 6 so the final print is 6.
Console.WriteLine(c.Add(new int[] {1, 2, 3}));


