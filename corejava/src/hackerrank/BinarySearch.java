package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(60);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		int [] ar = new int[5];
		for(int i=0; i<ar.length; i++)
		{
			ar[i]= al.get(i);
		}
		for(int i=0; i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		int low = 0;
		int high = ar.length-1;
		int mid;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter key to be found: ");
		int key = scan.nextInt();
		while(low<=high)
		{
			mid = (low+high)/2;
			if(key==ar[mid])
			{
				System.out.println("Key is found "+key);
				System.exit(0);;
			}
			else if(key<ar[mid])
			{
				high = mid-1;
			}
			else if(key>ar[mid])
			{
				low = mid+1;
			}
		}
		System.out.println("Key is not found.");
	}

}
