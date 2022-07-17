package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		numbers.add(110);
		numbers.add(120);
		
		List<Integer> newlist = numbers.stream()
				.filter(n->n>100)
				.collect(Collectors.toList());
		System.out.println(newlist);
	}

}
