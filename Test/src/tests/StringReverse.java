package tests;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String str="hello";
		
		String result="";
		
		for (int i = str.length()-1; i >=0; i--) {
			result = result+str.charAt(i);
		}
		
		System.out.println(result);
		
		char[] charArray = str.toCharArray();
		
		String temp="";
		for (int i = charArray.length-1; i >=0; i--) {
			
			temp= temp+charArray[i];
			
		}
		
		System.out.println(temp);
		
		
		StringBuilder strb = new StringBuilder(str);
		
		System.out.println(strb.reverse());
		
		StringBuffer strbuff = new StringBuffer(str);
		
		System.out.println(strbuff);
		
		
	}

}
