package com.leet.integer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] TwoNos=getTwoNoUsingMap(new int[] {1,2,7,9},9);
		
		System.out.println(Arrays.toString(TwoNos));
	}

	public static int[] getTwoNoUsingMap(int []input,int target ) {
		Map<Integer, Integer> map=new HashMap<>();
		
		for(int no:input) {
			int remains=target-no;
			if(map.containsKey(remains)) {
				return new int [] {map.get(remains),no};
			}
			map.put(no, no);
		}
		throw new IllegalArgumentException("No no found");
	}
	
	
}
