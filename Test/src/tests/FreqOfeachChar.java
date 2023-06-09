package tests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FreqOfeachChar {
	
	public static void main(String[] args) {
		
		String  str = "ilovelindia";
		
		long count = IntStream.range(0, str.length()).mapToObj(e->str.charAt(e)).count();
		
		System.out.println(count);
	
		 Map<String, Long> collect = Arrays.stream(str.split("")).
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		 
				
		System.out.println(collect);
		
		List<String> collect2 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
		entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
		
		System.out.println(collect2);
		
		//first non repetitive character
		
		String key = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap:: new,Collectors.counting())).
				entrySet().stream().filter(e->e.getValue()==1).findFirst().get().getKey();
		
		System.out.println(key);
		
		HashMap<Character, Integer> output = CountCharsInString(str);
		System.out.println(output);
		
		}
		
	private static HashMap<Character, Integer> CountCharsInString(String str) {

		HashMap<Character,Integer> map = new HashMap<>();
		
		char[] charArray= str.toCharArray();

		for (char c : charArray) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			}else {
				map.put(c, 1);
			}
			
	}
		return map;

	}
	}
