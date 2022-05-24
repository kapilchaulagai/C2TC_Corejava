package abc;
import java.util.*;
public class ScanFunctions {

	public static void main(String[] args) {
		// TODO Use of Different functions inside the Scanner Class
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Your Name:");
		String name = scan.nextLine();
		
		//System.out.println("Please Enter Your Name:");
		//String name1 = scan.next(); This doesn't accept spaces between Strings entered as input.
		
		char c = scan.next().charAt(2);
		System.out.println("c: "+c);
		
		System.out.println("Please Enter Your Age:");
		int age = scan.nextInt();
		
		System.out.println("Please Enter Your Java and DBMS Marks Respectively:");
		float mark1 = scan.nextFloat();
		float mark2 = scan.nextFloat();
		
		System.out.println("Name is: "+name);
		System.out.println("Age of "+name+" is : "+age);
		System.out.println("Marks for DBMS and JAVA is: "+mark1+" and "+mark2+" respectively.");
	}

}
