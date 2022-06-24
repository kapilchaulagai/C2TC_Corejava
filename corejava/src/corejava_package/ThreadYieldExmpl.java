package corejava_package;

public class ThreadYieldExmpl implements Runnable{
	public void run()
	{
		String str = Thread.currentThread().getName();
		if(str=="Second Child")
		{
			secondChild();
		}
		System.out.println(Thread.currentThread());
		try 
		{
			System.out.println("After Using Join:"+Thread.currentThread());
			Thread.currentThread().join();
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}
	}
	void secondChild()
	{
		System.out.println(Thread.currentThread());
		Thread.yield();
		try
		{
			Thread.sleep(2000);
			System.out.println(Thread.currentThread());
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadYieldExmpl tye1 = new ThreadYieldExmpl();
		Thread t1 = new Thread(tye1, "First Child");
		
		ThreadYieldExmpl tye2 = new ThreadYieldExmpl();
		Thread t2 = new Thread(tye2, "Second Child");
		
		t1.start();
		t2.start();
	}

}
