package Greeter;
/**
 * a class to test the Greeter class.
 */
public class GreeterTester
{
	public static void main(String[] args) 
	{
		Greeter greet = new Greeter();
		System.out.println(greet.sayHello());
		System.out.println(greet.sayGoodbye());
		System.out.println(greet.refuseHelp());
		
		Greeter greetMe = new Greeter("Dillon");
		System.out.println(greetMe.sayHello());
		System.out.println(greetMe.sayGoodbye());
		System.out.println(greetMe.refuseHelp());
	}
}

/*
Output:
Hello, Dillon
Bye, Dillon
I am sorry, Dillon. I am afraid I can�t do that.
Expected:
Hello, Dillon
Bye, Dillon
I am sorry, Dillon. I am afraid I can�t do that.
*/