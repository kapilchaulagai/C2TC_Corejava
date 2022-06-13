package corejava_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowTest3 
{
	InputStreamReader sr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(sr);
	String firstName;
	String lastName;
	void accept() throws IOException
	{
	System.out.println("Enter your first name");
	firstName= br.readLine();

	System.out.println("Enter your last name");
	lastName = br.readLine();
	}
	void display()
	{
		System.out.println("Full Name:"+firstName+lastName);
	}
	public static void main(String[] args) throws IOException
	{
		ThrowTest3 obj = new ThrowTest3();
		obj.accept();
		obj.display();
	}
}
