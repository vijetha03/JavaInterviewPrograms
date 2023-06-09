package tests;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,9,24,27,56};
		
		int outputIndex = binarySearch(arr,0,4,27);
		System.out.println(outputIndex);
	
	}

	private static int binarySearch(int[] arr, int low, int high, int key) {

		if(low>high) {
			return -1;
		}
		
		int mid =(low+high)/2;
		
		while(low<high) {
			if(arr[mid]<key) {
				return low=mid+1;
			}else if(arr[mid]==key) {
				return mid;
			}else {
				high = mid-1;
			}
			
			mid = (low+high)/2;
			
		}
		return -1;
		
	}

}
