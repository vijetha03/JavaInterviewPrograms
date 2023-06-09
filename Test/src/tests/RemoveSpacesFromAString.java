package tests;

public class RemoveSpacesFromAString {
	
	public static void main(String[] args) {
		String str ="  I am vijetha  ";
		
		removeSpacesFromString1(str);
		String output = removeTrailSpaces(str);
		System.out.println(output);
		
	}

	private static String removeTrailSpaces(String str) {
		// TODO Auto-generated method stub
		String str1= str.strip();
		return str1;
		
	}

	private static void removeSpacesFromString1(String str) {
		
		StringBuilder output = new StringBuilder();
		char[] chars = str.toCharArray();
		for (char c : chars) {
			if(!Character.isWhitespace(c)) {
				output.append(c);
			}
		}
		System.out.println(output.toString());// TODO Auto-generated method stub
		
	}

	private static void removeSpacesFromString(String str) {
		// TODO Auto-generated method stub
		String[] strArray=str.split(" ");
				
		for (String string : strArray) {
			System.out.print(string);
		}
	
	}

}
