package hackerrank;
/* Question: ar1 = [a,b,a,b]
 *           ar2 = [a,c,blank,b]
 *        	- we need to assign 4 for right answers and -1 for wrong answer.
 *          - we need to compare two arrays and if it's the same add with 4 if it's not the same -1
 *          and if there is a blank element we do not consider that.*/
import java.util.Scanner;

public class ArrayPrblm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int points = 0;
		String ar1[] = new String[4];
		String ar2[] = new String[4];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the inputs of ar1: ");
		for(int i=0; i<ar1.length;i++)
		{
			ar1[i] = scan.next();
		}
		System.out.println("Enter the inputs of ar2: ");
		for(int i=0; i<ar1.length;i++)
		{
			ar2[i] = scan.next();
		}
		for(int i=0;i<ar1.length;i++)
		{
			if((ar1[i].equals("blank")||ar2[i].equals("blank"))!=true)
			{
				if(ar1[i].equals(ar2[i]))
				{
					points = points+4;
				}
				else
				{
					points = points-1;
				}
			}
		}
		System.out.println(points);
	}

}
