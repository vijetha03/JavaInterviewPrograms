package tests;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class elementsstartswith1 {
	
	public static void main(String[] args) {
		
		int[] numbers = {2,23, 5,6 ,17,71,11,43,15};
		
		List<String> stringList = Arrays.stream(numbers).boxed().map(s->s +"").collect(Collectors.toList());
		System.out.println(stringList);

		
		List<String> collect1 = Arrays.stream(numbers).boxed().map(s->s + "" ).filter(s->s.startsWith("1")).collect(Collectors.toList());
		System.out.println(collect1);
		
		
		String[] str = {"vij","et","ha"};
		
		String result = String.join("", str);
		System.out.println(result);

		
	}

}
