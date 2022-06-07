package abc;

public class PatternExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				while(j==n/2&&i==0)
				{
				System.out.print("#");
				i++;
				j++;
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

}
