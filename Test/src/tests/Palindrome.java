package tests;

public class Palindrome {
	
	public static void main(String[] args) {
		String str ="civic";
		boolean isTrue=isPalindrome(str);
		System.out.println(isTrue);
	}

	private static boolean isPalindrome(String str) {
		String revString="";
		for (int i = str.length()-1; i >=0; i--) {
			revString = revString+str.charAt(i);
			
		}
		System.out.println(revString);
		return revString.equals(str);
	}

}
