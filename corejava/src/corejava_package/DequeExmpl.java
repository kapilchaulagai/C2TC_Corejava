package corejava_package;

import java.util.ArrayDeque;

public class DequeExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("JVM");
		ad.add("DBMS");
		ad.add("IDBC");
		ad.add("JAVA");
		ad.add("SQL");
		ad.add("CSS");
		System.out.println(ad);
		
		ad.addFirst("First");
		ad.addLast("Last");
		System.out.println(ad.size());
		ad.offer("Offer1");
		System.out.println(ad);
		ad.offerFirst("Offer First");
		ad.offerLast("OfferLast");
		ad.offer("Final");
		System.out.println(ad);
		System.out.println(ad.size());
		
		System.out.println("Poll "+ad.poll());
		String str = ad.toString();
		System.out.println(str);
		
		char [] ch = str.toCharArray();
		System.out.println(ch);
		System.out.println(ch[0]);
	}

}
