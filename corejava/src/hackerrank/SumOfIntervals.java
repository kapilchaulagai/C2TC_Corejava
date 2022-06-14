package hackerrank;
//half solved
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntervals {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	ArrayList<Integer> ar= new ArrayList<Integer>();
	
		ar.add(scan.nextInt());
		ar.add(scan.nextInt());
		System.out.println(ar);
		
		int sum = 0;
		int diff = ar.get(1)-ar.get(0);
		for(int i=0;i<=diff; i++)
		{
			int mod = (ar.get(0)%10);
			sum = sum + ((ar.get(0)/10)+mod);
			mod++;
		}
		System.out.println("Sum = "+sum);
	}

}
