
package corejava_package;
import java.io.IOException;
public class ThrowTest4 {
	// TODO Auto-generated method stub
	static void display() throws IOException
	{
			System.out.println("Hello Java");
			throw new IOException();
		
	}
	public static void main(String[] args) 
	{
		ThrowTest4 obj = new ThrowTest4();
		try 
		{
			obj.display();//static method must be accessed through class name reference
		}
		catch (IOException e) 
		{
		System.out.println("Caught an exception: \n" +e);
		}
	}

}
