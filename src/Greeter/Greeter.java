/*
 * In this project, you will explore an object-oriented alternative to the �Hello, World� program in Chapter 1. 
Begin with a simple Greeter class that has a single method, sayHello. That method should return a string, not print it. 
Create two objects of this class and invoke their sayHello methods. Of course, both objects return the same answer.
Enhance the Greeter class so that each object produces a customized greeting. 
For example, the object constructed as new Greeter("Dave") should say "Hello, Dave". 
(Use the concat method to combine strings to form a longer string, 
or peek ahead at Section 4.5 to see how you can use the + operator for the same purpose.)
Add a method sayGoodbye to the Greeter class. Finally, add a method refuseHelp to the Greeter class. 
It should return a string such as "I am sorry, Dave. I am afraid I can�t do that."
 * 
 * 
 */
package Greeter;

/**
 * A simple greeter for a given name.
 */
public class Greeter
{
	String greeting = "Hello";
	String farewell = "Bye";
	String name = "";
	
	/**
	 * Constructs a Greeter.
	 */
	public Greeter()
	{
		greeting = greeting.concat("!");
		farewell = farewell.concat("!");
	}
	
	/**
	 * Constructs a Greeter with the given name.
	 * @param name name for greeter
	 */
	public Greeter(String name)
	{
		this.name = name;
		greeting = greeting + ", " + name + "!";
		farewell = farewell + ", " + name + "!";
	}
	
	/**
	 * Displays greeting message.
	 * @return string with greeting
	 */
	public String sayHello()
	{
		return greeting;
	}
	
	/**
	 * Displays farewell message.
	 * @return string with farewell
	 */
	public String sayGoodbye()
	{
		return farewell;
	}
	
	/**
	 * Displays message of refusal
	 * @return string with refusal
	 */
	public String refuseHelp()
	{
		if(this.name.equals(""))
				return ("I am sorry. I am afraid I can't do that.");
		else
				return ("I am sorry, " + name + ". I am afraid I can't do that.");
	}
}
