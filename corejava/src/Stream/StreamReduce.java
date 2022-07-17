package Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		numbers.add(110);
		numbers.add(120);
		System.out.println(numbers);
		
		Stream<Integer> stream = numbers.stream();
		Optional<Integer> sum = stream.reduce(Integer::sum);		
				System.out.println("ans = "+sum.get());
	}

}
