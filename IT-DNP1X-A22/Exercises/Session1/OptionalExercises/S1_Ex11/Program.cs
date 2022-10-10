/*
Write a method with the following behaviour:
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. 
Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
*/

Console.WriteLine(CountClumps(new [] {1, 2, 2, 3, 4, 4}));
Console.WriteLine(CountClumps(new [] {1, 1, 2, 1, 1}));
Console.WriteLine(CountClumps(new [] {1, 1, 1, 1, 1}));



int CountClumps(int[] ints)//Method CountClumps is taking arguments intArray named ints
{
    var clumps = 0; //var clumps is assigned the value of 0
    for (var i = 0; i < ints.Length -1; i++)
    /*for loop that contains 3 statements:
     statement 1: "var i = 0;" is executed (one time) before the execution of the code block
     statement 2: "i < ints.Length - 1;" defines the condition for executing the code block and 
     the "ints.Length -1" defines the range of the array -1 so it starts from 0
     statement 3: "i++ is executed (every time)" after the code block has been executed.
    */
    {
        var clump = false;//variable clump is assigned boolean type false

        while (i < ints.Length -1 && ints[i] == ints[i + 1])//while loop that has as condition for both of its parameters to be true
        {
            clump = true;//clump variable is assigned the new value true
            i++;//i is told to increment/increase by 1
        }

        if (clump)//variable clump is conditioned that if is true, than it will increase clumps by 1
        {
            clumps++;
        }
    }
    return clumps; //return clumps
}