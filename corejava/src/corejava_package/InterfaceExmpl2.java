package corejava_package;

import java.util.Scanner;

interface FahadBhaii
{
/* compiler will treat them as:
* public abstract void method1();
* public abstract void method2();
*/
public void addition();
public void subtraction();
public void division();
public void multiplication();
}

public class InterfaceExmpl2 implements FahadBhaii 
{
	int a,b,sum,sub,mul;
	float div;
	Scanner scan = new Scanner(System.in);
	{
		System.out.println("Enter two integers a and b : ");
		a = scan.nextInt();
		b = scan.nextInt();
	}
	public void addition()
	{
//		System.out.println("Enter two integers a and b to add: ");
//		a = scan.nextInt();
//		b = scan.nextInt();
		sum = a+b;
		System.out.println("The Sum is: "+sum+" .");
	}
	public void subtraction()
	{
//		System.out.println("Enter two integers a and b to subtract b from a: ");
//		a = scan.nextInt();
//		b = scan.nextInt();
		sub = a-b;
		System.out.println("The Difference is: "+sub+" .");
	}
	public void multiplication()
	{
//		System.out.println("Enter two integers a and b to multiply : ");
//		a = scan.nextInt();
//		b = scan.nextInt();
		mul = a*b;
		System.out.println("The Product is: "+mul+" .");
	}
	public void division()
	{
		try {
//		System.out.println("Enter two integers a and b to divide a by b: ");
//		a = scan.nextInt();
//		b = scan.nextInt();
		div = a/b;
		System.out.println("The Quotient is: "+div+" .");
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input. Donot Enter b = 0.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExmpl2 obj = new InterfaceExmpl2();
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();
	}

}
