package tests;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicateWordsfromSentence {

	public static void main(String[] args) {
		String str = "I am am a a happy girl";
		
		String finalString ="";
		
		String[] strarr= str.split(" ");
		
		String collect2 = Arrays.stream(strarr).distinct().collect(Collectors.joining(" "));
		System.out.println(collect2);
		
		List<String> collect = Arrays.stream(strarr).distinct().collect(Collectors.toList());
		for (String string : collect) {
			finalString+=string + " ";
		}
		
		System.out.println(finalString);
		
	}
	
	
}
