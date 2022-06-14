package abc;

import java.util.LinkedList;

public class LkdLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i=12; i<=18; i++)
		{
			ll.add(i);
		}
		System.out.println(ll);
		System.out.println("--------------------");
		ll.remove(2);
		System.out.println(ll);
		for(Object obj:ll)
		{
			System.out.println(obj);
		}
		System.out.println("--------------------");
		for(int j=0; j<ll.size(); j++)
		{
			System.out.println(ll.get(j));
		}
	}

}
