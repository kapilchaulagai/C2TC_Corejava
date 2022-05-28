package abc;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Print Arm Strong numbers from 1 to 1000
		int sum=0,n,a;
		for(int i=1;i<=1000;i++)
		{
			n=i;
			while(n>0)
			{
				a=n%10;
				sum=sum+(a*a*a);
				n = n/10;
			}
			if(sum==i)
			{
				System.out.println(i+" ");
			}
			sum=0;
		}
	}

}
