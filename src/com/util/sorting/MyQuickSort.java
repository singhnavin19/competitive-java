package com.util.sorting;

public class MyQuickSort {

	public static void main(String[] args) {
		int[] input = new int[] { 2, 8, 9, 12, 6, 15, 13, 4, 3 };
		sort(input);
	}

	private static void sort(int[] input) {
		if (input == null || input.length == 0)
			return;
		quickSort(input, 0, input.length - 1);
	}

	private static void quickSort(int[] input, int i, int j) {

	}

}
