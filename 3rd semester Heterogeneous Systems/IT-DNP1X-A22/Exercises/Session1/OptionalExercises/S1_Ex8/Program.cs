﻿/*
Write a method with the following behaviour:
Given an "outer" string of length 4, such as "<<>>", and a word, return a 
new string where the word is in the middle of the out string, e.g. "<<word>>".

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
*/

Console.WriteLine(MakeOutWord("<<>>", "Yay"));
Console.WriteLine(MakeOutWord("<<>>", "WooHoo"));
Console.WriteLine(MakeOutWord("[[]]", "word"));

string MakeOutWord(string outer, string word)
{
    //return $"{outer[..2]}{word}{outer.Substring(2, 2)}"; and
    //return $"{outer[..2]}{word}{outer[2..]}"; are doing the same, so either use interpolation to specify the range
    //of the string, or use ".Substring" to specify the: "int startIndex" and "int lenght"
    //of the string that you want to be inserted
    /*def: Retrieves a substring from this instance. 
    The substring starts at a specified character position and has a specified length. 
    Params:
    startIndex – The zero-based starting character position of a substring in this instance.
    length – The number of characters in the substring.
    Returns:
    A string that is equivalent to the substring of length length that begins at startIndex in this instance, or Empty if startIndex is equal to the length of this instance and length is zero.
    Exceptions:
    ArgumentOutOfRangeException – startIndex plus length indicates a position not within this instance. -or- startIndex or length is less than zero.
    */
    //works and remains as answer:
    return $"{outer[..2]}{word}{outer[^2..]}"; //Example found: Console.WriteLine($"{numbers[^x]} is the same as {numbers[numbers.Length - x]}");
    
    /*Test:
    Tested this but I dont know how to make the .. equivalent of it to work:
    return $"{outer[..2]}{word}{outer[outer.Length -2]}";
    */
    
    /*FIX
     fixed the other part of the outer range from: return $"{outer[..2]}{word}{outer[2..]}"; to
     return $"{outer[..2]}{word}{outer[^2..]}"
     */

    //return $"{outer[..2]}{word}{outer[3..]}";// I realized it starts from --> and shows what remains
    //return $"{outer[..2]}{word}{outer[^4..]}";//I realized that using "^" it starts from --> but shows 
    //everything instead of taking them away.
}