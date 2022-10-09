using S1_Ex5._2.MathLib;

var c = new Calculator();
Console.WriteLine(c.Add(2,2));
Console.WriteLine(c.Add(new [] {1,2}));
/*Logic explained
must use new keyword and create a new instance for the array with the new values that you 
can assign using new [] {1,2} ( basically you say, new array have this new set of values, than you say variable c that is holding object Calculator and its methods
call the method of calculator named Add and has the following values fx:
Console.WriteLine(c.Add(new [] {1,2})); (new [] {1,2}) -- values fed to the method Add.
(c.Add) object calculator that is stored in var c calling his Add method.
(Console.WriteLine) -- a default object console and method WriteLine that comes with C# default library.
everything that is inside ((())) is treated as priority over what is outside, like a circle of priority.
*/
