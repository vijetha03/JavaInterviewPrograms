package tests;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultiplyArray {
	
	public static void main(String[] args) {
		
		
		Integer[] arr = {1,2,3,4,5,6,7};
		
		List<Integer> intList = Arrays.asList(arr);
		
		Optional<Integer> output = intList.stream().reduce((a,b)->a*b);
		
		if(output.isPresent()) {
			System.out.println("The multiplication of array is:" +output.get());
		
		}else {
			System.out.println("Empty array or list");
		}
		
		
		Integer temp=1;
		
		for (Integer integer : intList) {
			
			temp = temp*integer;
			
		}
		System.out.println(temp);		
		
	}

}
