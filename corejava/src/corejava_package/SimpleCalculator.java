package corejava_package;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations o = new Operations();
		o.prnsqr('S');
		o.prnsqr(5);
		o.prnsqr(5.5f);
	}

}
class Operations
{
	void prnsqr(char c)
	{
		System.out.println("Square starts from alphabet "+c);
	}
	void prnsqr(int i)
	{
		System.out.println("Square of the integer "+i+"is "+i*i);
	}
	void prnsqr(float f)
	{
		System.out.println("Square of the float "+f+" is "+f*f);
	}
}
