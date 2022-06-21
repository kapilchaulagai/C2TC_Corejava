package corejava_package;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedHashSet<String> set = new LinkedHashSet<String>();//Order of insertion is preserved
		HashSet<String> set = new HashSet<String>();
		
		set.add("Fahad");
		set.add("Kiran");
		set.add("Hero");
		set.add("Hero");
		set.add("JVM");
		set.add("jdk");
		System.out.println(set);
		
		set.remove("Fahad");
		System.out.println(set);
		set.add("Jange");
		System.out.println(set);
		
		System.out.println(set.size());
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(set.add(null));
		System.out.println(set.add(null));
		System.out.println(set);
	}

}
