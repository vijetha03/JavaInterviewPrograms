package tests;

public class SwapTwoStrings {

	public static void main(String[] args) {
	
		String s1="Vijetha";
		String s2="Yenikepati";
		
		String output = SwapTwoStrings(s1,s2);
		System.out.println(output);

	}

	private static String SwapTwoStrings(String s1, String s2) {
  
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		return s1+" "+ s2;
		
	}

}
