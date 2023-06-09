package tests;

public class CountOfCapsInString {

	public static void main(String[] args) {
		String str= "IAmVijetha";
		int count =CountOfCapsInString(str);
		System.out.println(count);
	}

	private static int CountOfCapsInString(String str) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
			 count++;
			}
		}
		return count;
	}

}
