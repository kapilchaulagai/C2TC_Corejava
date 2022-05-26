package abc;
import java.util.Scanner;
public class TokenExample {

	public static void main(String[] args) {
		// Example for different Inheritance
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an integer:");
		boolean b = reader.hasNextInt();
		System.out.println("You entered an Integer: "+b);
		Monkey m = new Monkey();
		Tiger t = new Tiger();
		Crocodiles c = new Crocodiles();
		m.live();
		m.eat();
		m.walk();
		
		t.live();
		t.eat();
		t.walk();
		
		c.live();
		c.eat();
		c.walk();
		
	}

}
abstract class Animal
{
	int legs = 4, tail,face = 1, ears = 2;
	
	void eat()
	{
		System.out.println("They eat food like humans to live.");
	}
	void walk()
	{
		System.out.println("They have "+legs+" legs to walk and run.");
	}
	abstract void live();
}
class Monkey extends Animal
{
	void live()
	{
		System.out.println("Monkeys live in trees.");
	}
}
class Tiger extends Animal
{
	void live()
	{
		System.out.println("Tigers live in Caves.");
	}
}
class Crocodiles extends Animal
{
	void live()
	{
		System.out.println("Crocodiles live under water.");
	}
}