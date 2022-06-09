package hackerrank;
/*You walk by a jwellery store. You know that I different kinds of jewels are numbered from 1 to N in the store. 
You also know that the store has the same number of jewels of different kinds in the store. You only see R 
jewels through the store vitrine glass display case. Determine the minimum possible number of jewels in the store.

Input
 The first line of input contains an integer N, 
representing the number of possible different jewels in the store. 
The second line of input contains an integer R representing the number of jewels you see through the store vitrine. 
The third line of the input contains R integers K1, K2... KR. K represents the type of the ith jewel.


Output

Print the minimum possible  number of jewelry in the store.

Constraints 
1 <=R<=105 
1 <=N<= 2000*/

import java.util.HashSet;
import java.util.Scanner;

public class SetProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of N & R: ");
		int N = scan.nextInt();
		int R = scan.nextInt();
		
		HashSet<Integer> res = new HashSet<Integer>();
		res.add(4);
		res.add(11);
		res.add(4);
		
		System.out.println("Enter the jwellery type you saw: ");
		for(int i=0; i<R; i++)
		{
			res.add(scan.nextInt());
		}
		System.out.println("Minimum type of jwellery are:"+res.size());
	}

}
