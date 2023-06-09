package tests;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[] arr = {4,7,5,8,3};
		
		
		
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		int temp;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
