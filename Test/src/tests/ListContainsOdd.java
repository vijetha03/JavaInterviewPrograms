package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListContainsOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		
		boolean isOdd =list.parallelStream().anyMatch(e->e%2!=0);
		System.out.println(isOdd);

	}

}
