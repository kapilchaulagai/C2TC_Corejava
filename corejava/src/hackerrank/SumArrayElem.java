package hackerrank;
import java.util.Arrays;
import java.util.HashSet;
//sum of the array elements which is not repeated
import java.util.Scanner;
import java.util.Set;

public class SumArrayElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int arr[] = new int[scan.nextInt()];
		
		int sum = 0;
		System.out.println("Enter the: "+arr.length+" integers.");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		
		Set<Integer> ss = new HashSet<Integer>();
		for(int i=0; i<arr.length;i++)
		{
			ss.add(arr[i]);
		}
		System.out.println(ss);
		
		for(int e:ss)
		{
			sum = sum+e;
		}
		System.out.println("Sum is: "+sum);
	}

}
