package cap.practice.java;

public class Practice5 
{
	void m1(Integer i) 
	{
		System.out.println("Hello"); 
	}
	void m1(String s) 
	{
	    System.out.println("Java");	 
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Practice5 a = new Practice5();
		//a.m1(null); //case of ambiguity
		a.m1("Hello");
	}

}
