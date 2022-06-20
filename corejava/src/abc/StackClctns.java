package abc;

import java.util.Iterator;
import java.util.Stack;

public class StackClctns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> str = new Stack<String>();
		str.push("Fahad");
		str.push("Kiran");
		str.push("Kapil");
		str.push("Hero");
		str.push("Don");
		
		System.out.println("Total elements are "+str);
		System.out.println("Size of the string "+str.size());
		
		System.out.println("The popped element is "+str.pop());
		
		System.out.println("Peeked element is "+str.peek());
		System.out.println("Is the stack empty: "+str.empty());
		
		Iterator itr = str.iterator();
		System.out.println("Using Iterator: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next()+"");
		}
		
		for(int i=0;i<2; i++)
		{
			System.out.println("Popped at "+i+": "+str.pop()+".");
		}
		itr = str.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+"");
		}
	}

}
