/*
Create a new project. Create a method with the following behaviour:
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

Examples:
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"

You can use the usual string concatenation from Java, but consider a C# specific approach.
Call your method from the Main method a couple of times with various input and verify the output.
*/
//As mentioned in S1_Ex7.1 comment I have realised and learned, that the program can be written 
//without the "namespace namespace S1_Ex7;" and "class Program" wrappers around the prints
//as the Program.cs file accepts printing the console like this as-well:
Console.WriteLine(MakeAbba("Hi", "Bye"));
Console.WriteLine(MakeAbba("Yo", "Alice"));
Console.WriteLine(MakeAbba("What", "Up"));
Console.WriteLine(MakeAbba("A", "B"));

string MakeAbba(string a, string b)
{
    return $"{a}{b}{b}{a}";
}