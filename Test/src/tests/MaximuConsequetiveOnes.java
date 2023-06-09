package tests;

public class MaximuConsequetiveOnes {
	
	public static void main(String[] args) {
		
		int[] arr= { 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1 };
		int output = MaximumConsequetiveOnes(arr);
		System.out.println(output);
	}

	private static int MaximumConsequetiveOnes(int[] arr) {
		
		int count =0;
		int max=0;
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i]==arr[i+1]) {
				count++;
			}else {
				count=0;
			}
			
			max=Math.max(max, count+1);
		}
		
		
		return max;
	}

	
	 

}
