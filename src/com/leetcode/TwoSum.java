package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] inputArray = { 1, 2, 5, 7 };
		int targetResult = 8;

		int[] resultNumbers = usingHashTable(inputArray, targetResult);
		for (int no : resultNumbers) {
			System.out.print(no);
		}

	}

	private static int[] usingHashTable(int[] inputArray, int targetResult) {

		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int no : inputArray) {
			int remain = targetResult - no;
			if (hashMap.containsKey(remain)) {
				return new int[] { no, hashMap.get(remain) };
			}
			hashMap.put(no, no);
		}
		return null;
	}

}
