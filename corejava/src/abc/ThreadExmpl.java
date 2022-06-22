package abc;
//	Single Thread Example
public class ThreadExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("Show about Thread "+t);
		System.out.println("Name of Thread is "+t.getName());
		
		t.setName("WhatEver");
		t.setPriority(10);// greater than 10 is not acceptable
		
		System.out.println("After Change "+t);
		
		System.out.println(t.getName());
	}

}
