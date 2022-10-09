// See Person.cs for full instructions comment.
//3.In the Main method of the Program class, create an instance of the Person class, specifying the name property with object initializer (slide 32-ish) notation and then call the Introduce method on the object.

using S1_Ex3;
//3.In the Main method of the Program class, create an instance of the Person class, specifying the name property with object initializer (slide 32-ish) notation
var person = new Person{Name = "Jakob"};

//and then call the Introduce method on the object.
person.Introduce();

