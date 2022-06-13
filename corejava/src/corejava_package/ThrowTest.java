package corejava_package;

public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ArithmeticException ae = new ArithmeticException("Hello from throw");
			throw ae;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Caught.");
			System.out.println(ae.getMessage());
		}
	}

}
