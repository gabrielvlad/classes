/*
Create a Calculator class and put it in it's own MathLib namespace. Optionally, create a separate folder for this class.
Create an Add method in the calculator that takes two numbers and returns their sum. Use it in the Main method of Program.cs.
Add an overload method for Add that takes an array of integers, adds them together, then returns the result. Use the for-each loop.
Use this overload method in the Main method of the program.
Print out the results. 
*/
//Same exercise with S1_Ex5 I just wrote it again to make sure I understand it.
using S1_Ex5._1.MathLib;

var c = new Calculator();
Console.WriteLine(c.Add(3,3));
Console.WriteLine(c.Add(new int[] {1,2}));