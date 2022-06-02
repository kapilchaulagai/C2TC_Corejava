package corejava_package;

import java.util.Scanner;
//Example of interface
interface MyInterface
{
	public static final int wheels =4;  //variables in interface are always declared public static final
	public static final int mirrors = 2;
	public static final int doors = 4;
	public static final int diggy = 1;
	
	void model(String mdl);
	void body();
	void speed(int spd);
}
class MyCar implements MyInterface
{
	public void model(String mdl)
	{
		System.out.println("The model of the car is "+mdl+" .");
	}

	@Override
	public void body() {
		// TODO Auto-generated method stub
		System.out.println("The car has "+wheels+" wheels, "+doors+" doors, "+diggy+" diggy and "+mirrors+" mirrors.");
	}

	@Override
	public void speed(int spd) {
		// TODO Auto-generated method stub
		System.out.println("The recommended speed is "+spd+" km/hr.");
	}
	void power(int hp)
	{
		System.out.println("This Car has horse power of "+hp+" hp.");
	}
}
public class Exampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MyCar c = new MyCar();
	c.model("Scorpio s2");
	c.body();
	c.speed(60);
	c.power(400);
	}

}
