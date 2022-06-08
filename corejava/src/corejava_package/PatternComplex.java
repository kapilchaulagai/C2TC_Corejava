package corejava_package;


public class PatternComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==j&&j>=(n-1)/2||i+j==n-1&&j<=(n-1)/2||i==n-1||i==(7*n)/9&&j>=n/3&&j<=(3*n)/5||i==(8*n)/9&&j>=n/3&&j<=(3*n)/5||j==(n-1)/3&&i>=(3*n)/4&&i<=(8*n)/9||j==(2*(n-1))/3&&i>=(3*n)/4&&i<=(8*n)/9)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(j==0||i==n-1||j==n-1||i==(n-1)/4&&j>=(n-1)/4&&j<=(3*(n-1))/4||i==(3*(n-1))/4&&j>=(n-1)/4&&j<=(3*(n-1))/4||j==(n-1)/4&&i>=(n-1)/4&&i<=(3*(n-1))/4||j==(3*(n-1))/4&&i>=(n-1)/4&&i<=(3*(n-1))/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(j==0&&i<=(n-1)/2||j==n-1&&i<=(n-1)/2||i+j==(n-1)/2||j-i==(n-1)/2||j==(n-1)/4&&i>(n-1)/4&&i<=(3*(n-1))/5||j==(3*(n-1))/4&&i>(n-1)/4&&i<=(3*(n-1))/5||i==(3*(n-1))/5&&j>(n-1)/4&&j<(3*(n-1))/4||j==(n-1)/2&&i>=(3*(n-1))/5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
