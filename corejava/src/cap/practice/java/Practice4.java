package cap.practice.java;

public class Practice4 {
	void m1(Integer i)
	{
		System.out.println("Hello");
	}
	void m1(Object o)
	{
		System.out.println("Java");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice4 p1  = new Practice4();
		p1.m1(null);
	}

}
//prints only Hello