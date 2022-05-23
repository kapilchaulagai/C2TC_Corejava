package corejava_package;
import java.util.*;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Print Whether given number is prime or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num value:");
		int num = sc.nextInt();
		
		int c=2;
		while(c*c<num)
		{
			if(num%c==0)
			{
				System.out.println("Number is not prime.");
				System.out.println("Thankyou");
				System.exit(0);
			}
			c=c+1;
		}
		System.out.println("Number is prime.");
		{
			System.out.println("Thankyou");
		}
	}

}
