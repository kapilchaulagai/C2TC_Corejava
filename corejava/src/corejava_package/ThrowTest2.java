package corejava_package;

public class ThrowTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int x=20; int y = 0;

		try
		{
		int z = x/y; // Exception occurred. 
		System.out.println("Result: "+z); 
		throw new ArithmeticException();
		}
		catch(ArithmeticException ae)
		{ 
			System.out.println("Exception caught: \n");
		}
	}

}
