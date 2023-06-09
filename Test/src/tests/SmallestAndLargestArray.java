package tests;

import java.util.*;
import java.util.stream.Collectors;

public class SmallestAndLargestArray {
	
	
	public static void main(String[] args) {
		int[] arr = {12,10,8,35,7};
		
		IntSummaryStatistics summaryStatistics = Arrays.stream(arr).map(e->e).summaryStatistics();
		int[] newArray = Arrays.stream(arr).sorted().toArray();
		System.out.println(Arrays.toString(newArray));
		
		int min = summaryStatistics.getMin();
		int max = summaryStatistics.getMax();
		int avg = (int) summaryStatistics.getSum();
		System.out.println(min);
		System.out.println(max);
		System.out.println(avg);
		int smallest= arr[0];
		int largest=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}else if(arr[i]<smallest)
				smallest= arr[i];
			}
			System.out.println("smallest is "+smallest);
			System.out.println("largest is "+largest);
		System.out.println(smallestNumber(arr));
		System.out.println(largestNumber(arr));
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>arr[i+1]) {
				arr[i]=temp;
				arr[i+1]=arr[i];
				temp=arr[i+1];
			}
			System.out.println("smallest is "+arr[0]);
			System.out.println("largest is "+arr[(arr.length)-1]);
			
		}
		
		
	}
	public static int smallestNumber(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	public static int largestNumber(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	
	public static void smallestNumberIterate(int[] arr) {
		int[] arr1 = {12,10,8,35,7};
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>arr[i+1]) {
				arr[i]=temp;
				arr[i+1]=arr[i];
				temp=arr[i];
			}
			System.out.println("smallest is "+arr[0]);
			System.out.println("largest is "+arr[arr.length]);
		}
	}}
	
		


