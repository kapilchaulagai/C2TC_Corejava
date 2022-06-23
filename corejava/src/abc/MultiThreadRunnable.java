package abc;
class Lecture implements Runnable
{
	public void run()
	{
		Thread tr = Thread.currentThread();
		String str = tr.getName();
		
		if(str == "JAVA")
		{
			java();
		}
		else if(str=="DBMS")
		{
			dbms();
		}
		else
		{
			softSkills();
		}
	}
	void java()
	{
		try
		{
			System.out.println("Thread name : "+Thread.currentThread().getName());
			for(int i=0; i<3; i++)
			{
				System.out.println("Java Class Started.");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught in Java Lecture.");
		}
	}
	void dbms()
	{
		try
		{
			System.out.println("Thread name : "+Thread.currentThread().getName());
			System.out.println("Java Class Started.");
			Thread.sleep(2000);
		}
		catch(Exception f)
		{
			System.out.println("Exception caught in DBMS class.");
		}
	}
	void softSkills()
	{
		try
		{
			System.out.println("Thread name : "+Thread.currentThread().getName());
			for(int i=0; i<3; i++)
			{
				System.out.println("Soft-Skills Class Started.");
				Thread.sleep(800);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught in Soft-Skills Lecture.");
		}
	}
}
public class MultiThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lecture l1 = new Lecture();
		Lecture l2 = new Lecture();
		Lecture l3 = new Lecture();
		
		Thread t1 = new Thread(l1);
		Thread t2 = new Thread(l2);
		Thread t3 = new Thread(l3);
		
		t1.setName("JAVA");
		t2.setName("DBMS");
		t3.setName("Soft-Skills");
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
