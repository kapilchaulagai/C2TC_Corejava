package corejava_package;

public class ThreadSleepExmpl implements Runnable {
	public void run()
	{
		System.out.println("Hello There.");
		try
		{
			Thread.sleep(1500);
			System.out.println("After Sleep "+Thread.currentThread().getName());
		}
		catch(InterruptedException ie)
		{
			System.out.println("Exception: "+ie.getMessage());
		}
		System.out.println(Thread.currentThread().getName()+"After try - catch.");
	}
	void normalMethod()
	{
		System.out.println("Print normal method.");
		System.out.println("Inide Normal Method: "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().activeCount());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSleepExmpl tse = new ThreadSleepExmpl();
		Thread t = new Thread(tse, "Child Thread.");
		t.start();
		System.out.println("Last Thread: "+t.getName());
		System.out.println(t.activeCount());
		tse.normalMethod();
		System.out.println(t.activeCount());
	}

}
