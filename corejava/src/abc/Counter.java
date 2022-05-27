package abc;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterEx c = new CounterEx();
		CounterEx c1 = new CounterEx();
		CounterEx c2 = new CounterEx();
	}

}
class CounterEx
{
	static int count = 0;
	
	CounterEx()
	{
		count++;
		System.out.println("count is: "+count);
	}
}