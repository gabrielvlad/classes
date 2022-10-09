/* Instructions:
1.Create a new project for this exercise, inside the solution folder for this session.
2.Create a new Person class. The class should contain a name property and an Introduce() method that prints “Hi, I am (name)” to the console. Use string interpolation here (slide 48-ish).
3.In the Main method of the Program class, create an instance of the Person class, specifying the name property with object initializer (slide 32-ish) notation and then call the Introduce method on the object.
*/

//1.
namespace S1_Ex3;
//2.Create a new Person class. The class should contain a name property and an Introduce() method that prints “Hi, I am (name)” to the console. Use string interpolation here (slide 48-ish).
public class Person
{
    public string? Name { get; set; }

    public void Introduce()
    {
        Console.WriteLine($"Hi, I am + {Name}!");
    }
}