package corejava_package;

public class MultiCatchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int arr[] = new int[6];
			arr[3] = 20/0;
			System.out.println("I am in try block");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("A number cannot be divided by zero.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array is out of specified limit");
		}
		catch(Exception e1)
		{
			//System.out.println(e1.getMessage());
			System.out.println("last Exception");
		}
		System.out.println("I am out of try-catch Block.");
	}

}
