package abc;

public class Algebra {

	public static void main(String[] args) {
		// TODO Print 1/x + 2/x + 3/x +....
		int n=10;
		String expr=null;
		for(int i=1;i<=10;i++)
		{
			expr = expr+(i+"/x + ");
		}
		System.out.println(expr.substring(4,62));
	}

}
