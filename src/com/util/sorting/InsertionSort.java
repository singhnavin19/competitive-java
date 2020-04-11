package com.util.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] source = new int[] { 3, 4, 5, 1, 9, 0 };
		int i, j, key;

		for (i = 1; i < source.length; i++) {
			key = source[i];
			j = i - 1;
			while (j >= 0 && source[j] > key) {
				source[j + 1] = source[j];
				j = j - 1;
			}
			source[j + 1] = key;
		}
		System.out.println(Arrays.toString(source));
	}
}
