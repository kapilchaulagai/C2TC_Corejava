package abc;
//BY EXTENDING THREAD CLASS
class MSWord extends Thread
{
	public void run()
	{
		Thread tr = Thread.currentThread();
		String str = tr.getName();
		
		if(str=="TYPING")
		{
			typing();
		}
		else if(str=="SPELL-CHECK")
		{
			spellCheck();
		}
		else
		{
			autoSave();
		}
	}
	void typing()
	{
		try
		{
			for(int i=0; i<=2; i++)
			{
				System.out.println("I am typing the report.");
				Thread.sleep(3000);
				System.out.println("Thread Details: "+Thread.currentThread());
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught.");
		}
		
	}
	void spellCheck()
	{
		for(int i=0; i<=2; i++)
		{
			System.out.println("Spelling is being checked in the report.");
		}
		System.out.println("Thread name: "+Thread.currentThread().getName());
	}
	void autoSave()
	{
		try
		{
			for(int i=0; i<=2; i++)
			{
				System.out.println("The report is being saved automatically.");
				Thread.sleep(2000);
			}
		}
		catch(Exception f)
		{
			System.out.println("Exception caught.");
		}
	}
}
public class MultiThreadingExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		MSWord ms1 = new MSWord();
		MSWord ms2 = new MSWord();
		MSWord ms3 = new MSWord();
		
//		Thread t1 = new Thread();
//		Thread t2 = new Thread();
//		Thread t3 = new Thread();
		
		ms1.setName("TYPING");
		ms2.setName("SPELL-CHECK");
		ms3.setName("AUTO-SAVE");
		
		ms1.setPriority(10);
		ms2.setPriority(1);
		ms3.setPriority(5);
		
		ms1.start();
		ms2.start();
		ms3.start();
	}
}