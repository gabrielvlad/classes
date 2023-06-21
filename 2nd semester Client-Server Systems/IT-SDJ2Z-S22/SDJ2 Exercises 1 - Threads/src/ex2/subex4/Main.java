/*
2.4 wait() and notifyAll()
Implement the following system implementing a burger bar with customers and employees. Employees are
making burgers and customers are eating burgers (see below)
UML
<<interface>>
java::lang::Runnable
+run():void

dashed line that ends with arrow head pointing to interface from the BurgerBarCustomer class

BurgerBarCustomer
-burgersToEat:int
-name:String
+BurgerBarCustomer(name:String,burgerbar:Burgerbar,burgersToEat:int)

dashed line that ends with arrow head pointing to interface from BurgerBarEmployee

BurgerBarEmployee
-name:String
+BurgerBarEmployee(name:String,burgerbar:Burgerbar)

direct continous line from BurgerBarCustomer and BurgerBarEmployee that both end in
Burgerbar with the arrowhead slim normal lines not filled with anything.

Burgerbar
-numberOfBurgers:int
-maxNumberOfBurgers
+Burgerbar(maxNumberOfBurgers:int)
+makeBurger(employeeName:String):void
+eatBurger(who:String):void
+getNumberOfBurgers():int

A class Burgerbar as a Monitor class (with private instance variables and all methods synchronized):
• A constructor setting the number of burgers to 0 and maxNumberOfBurgers to the values of the
argument
• A method makeBurger(…) incrementing the number of burgers by 1 (and let the calling thread
wait if counter >= maxNumberOfBurgers)
• A method eatBurger(…) decrementing the number of burgers by 1 (and let the calling thread
wait if counter <= 0)
• A method getNumberOfBurgers() returning the number of burgers
A class BurgerbarEmployeeimplementing Runnable. In the runmethod, create an infinite loop and
call the method makeBurger(…)in the loop body. Use a sleep to simulate that it takes some time to
make the burger (but never inside a synchronized method because sleep is not releasing the monitors lock).
A class BurgerbarCustomer implementing Runnable. In the run method, create a loop with
burgersToEat loop cycles and call the method eatBurger(…)in the loop body. Use a sleep to
simulate that it takes some time to eat the burger.
Implement a class with a main method in which you create a BurgerBar object, pass this to 2
BurgerbarEmployee objects and 5 BurgerbarCustomer objects (give values for parameters),
create all 7 threads with each of the Runnable objects and start up all threads.
…insert a few print-statements in class BurgerBar to see when a burger is made, and when it is eaten –
and by whom, e.g. insert something similar to the following when numberOfBurgers is updated and
just before a thread is blocked:
 System.out.println(who + " is ready to eat a burger (" +
numberOfBurgers + " left)");
Run the program a few times and inspect the output.
Extra: Try to close the burger bar when there are no more customers
*/
package ex2.subex4;

public class Main {
    public static void main(String[] args) {
        BurgerBar burgerBar = new BurgerBar(50);

        BurgerBarEmployee employee1 = new BurgerBarEmployee("Employee1", burgerBar);
        BurgerBarEmployee employee2 = new BurgerBarEmployee("Employee2", burgerBar);

        Thread empThread1 = new Thread(employee1);
        Thread empThread2 = new Thread(employee2);

        empThread1.start();
        empThread2.start();

        for (int i = 0; i < 5; i++) {
            BurgerBarCustomer customer = new BurgerBarCustomer("Customer" + (i + 1), burgerBar, 10);
            Thread custThread = new Thread(customer);
            custThread.start();
        }
    }
}

