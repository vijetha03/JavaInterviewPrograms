package tests;

import java.util.*;

public class MajorityElement {
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,3,4,5,5,5,5};
		System.out.println(majorityElement(arr,arr.length));
		
	}
	
	
	static int majorityElement(int[] arr, int size)
	{
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		
		for (int i : arr) {
			Integer val= map.get(i);
			if(val==null) {
				map.put(i, 1);
			}
			else {
				map.put(i, val+1);
			}
			
		}
		
		int maxrepeatedvaluecount = Collections.max(map.values());

		
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			if(entry.getValue()==maxrepeatedvaluecount) {
				System.out.println(entry.getKey()+" is repeated value");
				return entry.getKey();
			}
			}
		return -1;
	}


	
}
