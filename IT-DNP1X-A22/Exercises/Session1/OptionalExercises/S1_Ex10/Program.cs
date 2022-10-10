/*Description
Write a method with the following behaviour:
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
*/
/*Print to terminal but call method BigDiff first that gets int[] array as arguments(parameters),
the values are passed to the ints array than the "BigDiff()" goes in on the ints array and returns 
"ints.Max()" method and "ints.Min()"
*/


Console.WriteLine(BigDiff(new [] {10, 3, 5, 6}));
Console.WriteLine(BigDiff(new [] {7, 2, 10, 9}));
Console.WriteLine(BigDiff(new [] {2, 10, 7, 2}));

int BigDiff(int[] ints)
{
    return ints.Max() - ints.Min(); //The solution with positive numbers
    //return ints.Sum(); //You can use methods on the ints array using System.Array methods that can be used on arrays 
    //return ints.Min() - ints.Max(); //The solution with negative numbers
}
