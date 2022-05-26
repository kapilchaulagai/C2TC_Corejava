package corejava_package;

public class PolyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =  new A();
		B b = new B();
	}

}
class A
{
	void run()
	{
		System.out.println("Hi");
	}
}
class B extends A
{
	void run()
	{
		System.out.println("Hello");
	}
}
