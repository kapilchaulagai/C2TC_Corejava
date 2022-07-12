package abc;
class Table
{
	synchronized static void printTable(int n)//Synchronized Static Method Example
	{
		System.out.println("Table of "+n+" :");
		for(int i=0;i<n;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Thread01 extends Thread
{
	public void run()
	{
		Table.printTable(5);
	}
}
class Thread02 extends Thread
{
	public void run()
	{
		Table.printTable(6);
	}
}
class Thread03 extends Thread
{
	public void run()
	{
		Table.printTable(7);
	}
}
class Thread04 extends Thread
{
	public void run()
	{
		Table.printTable(3);
	}
}
public class SynchStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread01 t01 = new Thread01();
		Thread02 t02 = new Thread02();
		Thread03 t03 = new Thread03();
		Thread04 t04 = new Thread04();
		
		t01.start();
		t02.start();
		t03.start();
		t04.start();
	}

}
