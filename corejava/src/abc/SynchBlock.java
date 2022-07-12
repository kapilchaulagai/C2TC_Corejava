package abc;
class MyThread
{
	{System.out.println("Inside Synch-Block Class.");}
	void printName(String names, int n)
	{
		synchronized(this)//Synchronized block Example
		{
			System.out.println("How many "+names+" ?");
			for(int i=0;i<n;i++)
			{
				System.out.println(names+i);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
class MyThread1 extends Thread
{
	MyThread mt;
	MyThread1(MyThread mt)
	{
		this.mt = mt;
	}
	public void run()
	{
		System.out.println("MyThread1");
		mt.printName("Kapil",5);
	}
}
class MyThread2 extends Thread
{
	MyThread mt;
	MyThread2(MyThread mt)
	{
		this.mt = mt;
	}
	public void run()
	{
		System.out.println("MyThread2");
		mt.printName("Fahad",7);
	}
}
public class SynchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread obj = new MyThread();
		
		MyThread1 mt1 = new MyThread1(obj);
		MyThread2 mt2 = new MyThread2(obj);
		
		mt1.start();
		mt2.start();
	}

}
