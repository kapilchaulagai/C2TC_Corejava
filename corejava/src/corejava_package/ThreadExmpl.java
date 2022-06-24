package corejava_package;

public class ThreadExmpl extends Thread {
	static Thread t;
	public void run()
	{
		System.out.println("Thread is running.");
		t.stop();
		System.out.println("Learn Java Step by Step.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExmpl tl = new ThreadExmpl();
		t = new Thread(tl);
		t.start();
	}

}
