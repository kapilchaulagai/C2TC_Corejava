package abc;

public class Simplification {

	public static void main(String[] args) {
		// TODO print the result of 1-2+3-4+5....
		int n=10;
		int even=0;
		int odd=0;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				odd = odd+i;
				System.out.print("+"+i);
			}
			else
			{
				even = even-i;
				System.out.print(+-i);
			}
			sum = odd+even;
		}
		System.out.println("\tSum is: "+sum);
		
	}

}
