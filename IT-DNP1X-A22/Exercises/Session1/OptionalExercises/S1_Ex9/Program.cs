/*Instructions:
Write a method with the following behaviour:
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
*/

/*
string n;
int n;

return [1..] AND [..1] lenght n
*/

Console.WriteLine(NTwice("Hello", 2));
Console.WriteLine(NTwice("Chocolate", 3));
Console.WriteLine(NTwice("Chocolate", 1));

string NTwice(string word, int n)
{
   //Examples:
   //return $"{outer[..2]}{word}{outer.Substring(2, 2)}"; and
   //return $"{outer[..2]}{word}{outer[2..]}";
   
   //Tests:
   //return $"{word[..n]}+{(word.Length -n, n)}";
   //return $"{word[..n]}+{word[..]}";
   
   //works
   //return $"{word[..n]}+{word.Substring(word.Length -n,n)}"; //works shown by teacher
   return $"{word[..n]}+{word[^n..]}"; //works discovered by me from my tests, I choose to leave this one as an answer
   //return $"{word[..n]}+{word.Substring(word.Length -n)}"; //not specified lenght of n, still works
   
   //I realised/learned that:
   //return $"{word[^n]} is the same as {word[word.Length - n]}"; ^ means show without it, it will delete instead
   
   /*Expected output:
   nTwice("Hello", 2) → "Helo"
   nTwice("Chocolate", 3) → "Choate"
   nTwice("Chocolate", 1) → "Ce"
   */
}
