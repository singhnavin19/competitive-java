package com.geeksforgeeks.arrays;

import java.util.Arrays;

public class FindTriplets {

	public static void main(String[] args) {
		int[] source = { 12, 8, 2, 11, 5, 14, 10 };
		System.out.println(countTriplet(source, source.length));
	}

	static int countTriplet(int arr[], int n) {
		int count = 0;
		if (arr.length > 2) {
			Arrays.sort(arr);
			int firstNo = 0;
			int secondNo = 1;
			int thdirdNo = 2;

			while (thdirdNo <= n) {
				if (arr[firstNo] + arr[secondNo] == arr[thdirdNo]) {
					count++;
				}
				if (thdirdNo < n - 1) {
					firstNo = firstNo + 1;
					secondNo = secondNo + 1;
					thdirdNo = thdirdNo + 1;
				} else {
					break;
				}

			}

		}
		return count;
	}

}
