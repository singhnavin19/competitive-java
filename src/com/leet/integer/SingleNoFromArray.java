package com.leet.integer;

import java.util.HashMap;
import java.util.Map.Entry;

public class SingleNoFromArray {
	public static void main(String[] args) {
		int[] input = { 2, 1, 2, 2, 1, 2, 7 };
		HashMap<Integer, Integer> result = getSingleNo(input);
		getNoHaveRepeatition(result);

	}

	private static void getNoHaveRepeatition(HashMap<Integer, Integer> result) {
		for (Entry<Integer, Integer> entry : result.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey() + ":-" + entry.getValue());
			}
		}

	}

	public static HashMap<Integer, Integer> getSingleNo(int[] nos) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int no : nos) {
			if (map.containsKey(no)) {
				map.put(no, map.get(no) + 1);
			} else {
				map.put(no, 1);
			}
		}
		return map;
	}
}
