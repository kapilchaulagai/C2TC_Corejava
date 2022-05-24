package abc;
import java.util.Scanner;
public class TokenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an integer:");
		boolean b = reader.hasNextInt();
		System.out.println("You entered an Integer: "+b);
	}

}
