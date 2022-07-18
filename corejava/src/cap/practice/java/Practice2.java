package cap.practice.java;//Find output

public class Practice2 {
	private int m1(int x)
	{
		return 20;
	}
	private static String m1(String x)
	{
		return "abc";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice2 t = new Practice2();
		System.out.println(t.m1(20));
		System.out.println(t.m1(null));//whatever parameter is given but method returns 20 and abc
	}

}
