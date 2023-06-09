package tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindStringInFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		String str = "vijetha";
		String filepath = "C:\\Users\\HP\\Desktop\\Resumes\\TextFile.txt";
		boolean isFound = findString(filepath,str);
		System.out.println(isFound);
		
	}

	private static boolean findString(String filepath, String str) throws FileNotFoundException {
		File f = new File(filepath);
		Scanner scanner = new Scanner(f);
		
		while(scanner.hasNextLine()) {
			
			String nextLine = scanner.nextLine();
			if(nextLine.contains(str)) {
				scanner.close();
				return true;
			}
		}
		scanner.close();
		return false;
		
	}

}
