package com.geeksforgeeks.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int[] sourceArray = { 1, 2, 3, 7, 5 };
		int finalValue = 12;

//		List<Integer> destinationList = subarraySum(sourceArray, sourceArray.length, finalValue);
//		System.out.println(destinationList);
//
//		List<Integer> destinationList1 = subarraySum1(sourceArray, sourceArray.length, finalValue);
//		System.out.println(destinationList1);

		List<Integer> destinationList3 = subarraySum2(sourceArray, sourceArray.length, finalValue);
		System.out.println(destinationList3);

	}

	static ArrayList<Integer> subarraySum2(int[] arr, int n, int s) {
		int first = 0;
		int last = 0;

		long result = arr[first];
		ArrayList<Integer> res = new ArrayList<Integer>();
		while (result != s) {
			if (result > s) {
				if (first == last) {
					last++;
					first++;
					if (last >= n)
						break;
					result = arr[first];
				} else {
					result -= arr[first];
					first++;
				}
			} else {
				last++;
				if (last < n) {
					result += arr[last];
				} else {
					break;
				}
			}
		}

		if (result != s) {
			res.add(-1);
		} else {
			res.add(first + 1);
			res.add(last + 1);

		}
		return res;
	}

	static ArrayList<Integer> subarraySum1(int[] sourceArray, int n, int finalValue) {
		ArrayList<Integer> destinationList = new ArrayList<>();
		int tmpvalue = 0;
		for (int i = 0; i < n; i++) {
			tmpvalue = tmpvalue + sourceArray[i];
			if (tmpvalue < finalValue) {
				destinationList.add(sourceArray[i]);
			} else if (tmpvalue == finalValue) {
				break;
			} else {
				for (Integer no : destinationList) {
					if (tmpvalue < finalValue) {
						destinationList.remove(no);
						tmpvalue = tmpvalue - no;
					}
				}
			}
		}
		return destinationList;

	}

	static ArrayList<Integer> subarraySum(int[] sourceArray, int n, int finalValue) {
		ArrayList<Integer> destinationList = new ArrayList<>();
		boolean brk = false;

		for (int i = 0; i < n; i++) {
			int tempValue = 0;
			if (brk) {
				break;
			}
			for (int j = i; j < n; j++) {
				tempValue = tempValue + sourceArray[j];
				if (tempValue == finalValue) {
					destinationList.add(i + 1);
					destinationList.add(j + 1);
					brk = true;
					break;
				}
			}
		}
		if (destinationList.isEmpty()) {
			destinationList.add(-1);
			return destinationList;
		}
		return destinationList;
	}

}
