package abc;

public class TestClass {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int n = 10;
        int m = 0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                System.out.println();
            }
            System.out.println();
        }
        n=2;
        m=15;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
            	if(j>=6&&j<=9)
            	{
            		System.out.print("#");
            	}
            	else
            	{
            	System.out.print(".");
            	}
            }
            System.out.println();
        }
	}
}
