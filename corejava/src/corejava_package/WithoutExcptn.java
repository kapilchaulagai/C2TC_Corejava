package corejava_package;

import java.util.Scanner;

public class WithoutExcptn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 0,a;
		System.out.println("Will not be printed");
		Scanner scan = new Scanner(System.in);
		try
		{
			System.out.println("inside try before exception");
			a = 42/d;
			System.out.println("Will not be printed.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero is not acceptable.");
			System.out.print("Please enter the value of d(where,d!=0):");
			d = scan.nextInt();
			a = 42/d;
			System.out.println("The answer is: "+a);//prints only integer value
		}
		System.out.println("This will get printed.");
		String str = "Fahad";//Fahad replaced with null raise a NullPointerException
		try
		{
			System.out.println("try block executed \n"+str.equals("Fahad"));
		}
		catch(NullPointerException e)
		{
			str = new String("Hello");
			System.out.println("catch block executed \n"+str.equals("Hello"));
		}
		System.out.println("Continue");
	}

}
