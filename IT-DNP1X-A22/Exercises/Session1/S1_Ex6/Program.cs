/*
Add to the Calculator class from the previous exercise and method that 
takes two number inputs from the console and then displays the maximum 
of the two. Call the method from the main method.
(hint: use the Console.ReadLine() method).
*/
using S1_Ex6.MathLib;//Address to what is importing/using.
var c = new Calculator();//building the object in a variable so we can use its methods.
c.Max();//accessing the Max() method and because the method has input from keyboard 
//and print to console already in it there is nothing else that needs to be done, it will call it and initialise it in this
//instance variable called c

/*Personal Note on it is that this method could be called from the Calculator object directly if the "Max()" method becomes static by using
Full address of the method, as in telling it the object first like this: "Calculator.Max()" this will be calling the method
in a static context, but because the method is not static, and is not locked to the object, than we can build new variables with it(create new objects)
and than call it using the new object like this: "c.Max();"
*/

