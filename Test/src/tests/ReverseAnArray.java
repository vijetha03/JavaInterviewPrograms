package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAnArray {
	
	public static void main(String[] args) {
		
		 int[] arr = {1,2,3,4,5};
		 
		 List<Integer> output = reverseArray(arr);
		 System.out.println(output);
		 
	}

	private static List<Integer> reverseArray(int[] arr) {
		
		//List<Integer> list = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		for (int i = arr.length-1; i >=0; i--) {
			 list.add(arr[i]);
					 
		}
		return list;
		
	}

}
