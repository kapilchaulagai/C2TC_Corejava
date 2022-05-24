package corejava_package;
//Example of Abstraction and Polymorphism
import java.util.*;
import abc.Addition;
abstract class Car
{
	int wheels=4;
	int windows=4;
	
	abstract void move();
}
class Trip extends Car
{
	protected void move()
	{
		int total = wheels + windows;
		System.out.println("Car iS moving");
		System.out.println("Because Car has wheels numbers "+wheels);
		System.out.println("Get fresh air because car has windows numbers "+windows);
		System.out.println("Total number of windows and wheels are: "+total);
	}
	void move(int a, int b)
	{
		int sum = a+b;
		System.out.println("Sum of two numbers is:"+sum);
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Trip tr = new Trip();
			tr.move();
			tr.move(4,5);
			Addition ad = new Addition();
			ad.sum(10,30);
	}

}
