package tests;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "madam";
		
		String output= ReverseString(str);
		System.out.println(output);
	}

	private static String ReverseString(String str) {
		String output ="";
		
		for (int i = str.length()-1; i >=0; i--) {
			
			output =output+str.charAt(i);
		}
		return output;
		
	}
}
