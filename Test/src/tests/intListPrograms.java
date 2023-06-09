package tests;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class intListPrograms {
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,2,9,7,6};
		
		List<Integer> ascList = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
		
		System.out.println(ascList);
		
		List<Integer> descList = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(descList);
	
	
		Optional<Integer> secondHighest = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst();
		
		System.out.println(secondHighest);
		
		IntStream.rangeClosed(1, 10).skip(1).limit(8).forEach(x->System.out.println(x));
		
		
		
	}

}
