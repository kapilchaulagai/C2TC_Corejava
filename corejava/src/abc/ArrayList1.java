package abc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(12);
		al.add(14);
		al.add(12);
		al.add(3, 9);;
		System.out.println(al);
		System.out.println("------------");
		System.out.println(al.remove(2));

		
		Iterator ir = al.iterator();
		while(ir.hasNext()== true)
		{
			System.out.println(ir.next());
		}
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Kapil");
		al1.add("Fahad");
		al1.add("Kiran");
		al1.add("Hero");
		System.out.println(al1);
		
		LinkedList<String> ll = new LinkedList<String>();
		
		Iterator itr = al1.iterator();
		while(itr.hasNext()==true)
		{
			System.out.println(itr.next());
			String name = (String) itr.next();
			ll.add(name);
		}
		System.out.println(ll);
	}

}
