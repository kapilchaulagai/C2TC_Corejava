package abc;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector = new Vector<>();
		vector.add(10);
		vector.add(20);
		vector.add(11);
		vector.add(60);
		vector.add(44);
		System.out.println(vector);
		
		vector.insertElementAt(12,4);
		System.out.println(vector);
		System.out.println(vector.size());
		 vector.setSize(10);
		 System.out.println(vector.size());
		 System.out.println(vector);
		 
		 Iterator itr = vector.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 vector.setSize(3);
		 System.out.println(vector.size());
		 System.out.println(vector);
		 vector.add(11);
		 vector.add(60);
		 vector.add(44);
		 System.out.println(vector);
		 
		 Collections.sort(vector);
		 System.out.println(vector);
		 
	}

}
