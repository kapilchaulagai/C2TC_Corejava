package corejava_package;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//use of static keyword and final keyword in variables and methods
public class StaticExmpl {
	
	static String name;
	static String address;
	static String guardianof;
	static int semester;
	static int batch;
	int age;
	String department;
	
	static final String college_name = "SEACET";
	static final String message = "HEARTLY AND WARM WELCOME TO YOU";
	
	static Scanner scan = new Scanner(System.in);
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static
	{
		System.out.println("Enter the number 1 to college.");
		int press = scan.nextInt();
		if(press==1)
		{
			System.out.println("The College name is: "+college_name);
		}
		System.out.println(message);
		System.out.println("----------------------------------------------------------");
	}
	static void details()throws Exception
	{
		System.out.println("Enter your name: ");
		name = reader.readLine();
		System.out.println("Enter your address: ");
		address = reader.readLine();
		System.out.println("Enter your cild name: ");
		guardianof = reader.readLine();
		System.out.println("Enter your cild passout batch: ");
		batch = scan.nextInt();
		System.out.println("Enter your cild semester : ");
		semester = scan.nextInt();
	}
	void studentOf()throws Exception
	{
		System.out.println("Enter the age of your child: ");
		age = scan.nextInt();
		System.out.println("Enter the department your child belongs to: ");
		department = reader.readLine();
	}
	void display()
	{
		System.out.println("----------------------------------------------------------");
		System.out.println("Name of Guardian: "+name);
		System.out.println("Address of visitor Guardian: "+address);
		System.out.println("Name of Child, guardian wants to visit: "+guardianof);
		System.out.println("Semester: "+semester);
		System.out.println("Batch: "+batch);
		System.out.println("Age: "+age);
		System.out.println("Department: "+department);
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		StaticExmpl se = new StaticExmpl();
		StaticExmpl.details();
		se.studentOf();
		se.display();
	}

}
