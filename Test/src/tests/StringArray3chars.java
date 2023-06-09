package tests;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringArray3chars {
	
	public static void main(String[] args) {
		
		String[] arr= {"monday","tuesday","wednesday","thursday"};
		List<String> list = Arrays.stream(arr).map(e->e.substring(0, 3)).collect(Collectors.toList());
		System.out.println(list);
		
		String[] output = new String[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			String value = arr[i].substring(0,3);
			output[i]= value;
		}
		
		System.out.println(Arrays.toString(output));
		
	}

}
