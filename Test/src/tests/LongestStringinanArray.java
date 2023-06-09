package tests;

import java.util.Arrays;

public class LongestStringinanArray {
	
	public static void main(String[] args) {
		
		String[] strArray = {"vij","vijj","vijji","vijetha"};
		
		String string = Arrays.stream(strArray).reduce((e1, e2)-> e1.length() > e2.length() ? e1 : e2).get();
		
		System.out.println(string);
		
		Arrays.stream(strArray).reduce((e1,e2)-> e1.length()>e2.length() ? e1 :e2 ).get();
		
		
	}

}
