package cap.practice.java;

public class Practice3 {
	void m1(Object o)
	{
		System.out.println("Hello");
	}
	void m1(Object o, String s)
	{
		System.out.println("Java");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice3 p = new Practice3();
		p.m1(new Object());
		p.m1(new Object(), new String());
	}
}
//Prints "Hello Java"