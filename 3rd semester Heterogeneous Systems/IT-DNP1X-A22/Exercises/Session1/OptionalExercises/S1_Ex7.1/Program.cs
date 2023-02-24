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
namespace S1_Ex7._1;
/// <summary>
/// The Program class contains, 4 prints to console that are using the 
///method: "MakeAbba" the method is made to take 2 string variables values
///Than return them in the "a b b a " order, this is done using interpolation "$"
/// </summary>
static class Program //I realised and learned that the program can be written like this 
//using namespace and class Program as wrappers or can be written directly, just writing 
//them in Program.cs file both will work exactly the same, since the constructor
//Program.cs file accepts this.
{/// <summary>
 /// The main contains the MakeAbba string variable a and b values that are being initialized to them
 /// </summary>
 /// <param name="args"></param>
    public static void Main(string[] args)
    {
        Console.WriteLine(MakeAbba("Hi","Bye"));
        Console.WriteLine(MakeAbba("Yo", "Alice"));
        Console.WriteLine(MakeAbba("What", "Up"));
        Console.WriteLine(MakeAbba("A","B"));
        
        string MakeAbba(string a, string b)
        {
            return $"{a}{b}{b}{a}";
        }
    }
}