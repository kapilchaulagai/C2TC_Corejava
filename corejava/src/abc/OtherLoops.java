package abc;

public class OtherLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1,j=1; i<10||j<10;i++,j++)
		{
		j++;
		System.out.println("i= "+i+" and j= "+j);
		}

		// while loop
		int i=1,j=1;
		while(i<10 || j<10)
		{
		i++; j++;
		System.out.println("i= "+i+" and j= "+j);
		}
		// Do while loop
		int k = 1, l = 1;
		do {
		k++;
		l++;
		System.out.println("k= " + k + " and l= " + l);
		} while (k < 10 || l < 10);
	}

}
