package abc;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<4-i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<=9;i++)
		{
			for(int j=0;j<9-i;j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
