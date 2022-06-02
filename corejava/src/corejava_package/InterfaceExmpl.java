package corejava_package;

interface MyInterface1
{
	public static final int wheels =4;  //variables in interface are always declared public static final
	public static final int mirrors = 2;
	public static final int doors = 4;
	public static final int diggy = 1;
	
	void model(String mdl);
	void body();
	void speed(int spd);
}
public class InterfaceExmpl implements MyInterface1 {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExmpl ie = new InterfaceExmpl();
		ie.model("Scorpio s2");
		ie.body();
		ie.speed(60);
		ie.power(400);
	}

}
