package tests;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String str  ="GeeksForGeeks";
		String output =FirstNonRepeatingCharacter(str);
		System.out.println(output);
	}

	private static String FirstNonRepeatingCharacter(String str) {

		String key = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap:: new,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()==1).findFirst().get().getKey();
		return key;
	}

}
