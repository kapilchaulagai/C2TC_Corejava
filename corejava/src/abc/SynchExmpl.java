package abc;
class Thread1
{
		synchronized void printTable(int n)//Synchronized Method Example
		{
			System.out.println("Table of "+n+" :");
			try
			{
				for(int i=0; i<n&&i<10; i++)
				{
					System.out.println(n*i);
					Thread.sleep(400);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
}
class Thread2 extends Thread
{
	Thread1 t;
	Thread2(Thread1 t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class Thread3 extends Thread
{
	Thread1 t;
	Thread3(Thread1 t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
public class SynchExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 obj = new Thread1();
		Thread2 t2 = new Thread2(obj);
		Thread3 t3 = new Thread3(obj);
		
		t2.start();
		t3.start();
	}

}
