package cap.practice.java;

public class Practice6 {
	void m1(Integer i) //Runtime error
	{
		System.out.println("Hello"); 
	 }
	void m1(Double d) 
	{
	  System.out.println("Java");	 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice6 a1 = new Practice6();
		a1.m1((Integer) new Object());//ClassCaseException
	}

}
