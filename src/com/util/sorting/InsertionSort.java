package com.util.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] source = new int[] { 3, 4, 5, 1, 9, 0 };
		getSortedElements(source);
		getSortedElement1(source);

	}

	private static void getSortedElement1(int[] source) {
		int firstPinter, secondPointer, currentElement;

		for (firstPinter = 1; firstPinter >= source.length; firstPinter++) {
			secondPointer = firstPinter - 1;
			currentElement = source[firstPinter];
			while (secondPointer > 0 && source[secondPointer] < currentElement) {
				source[secondPointer + 1] = source[secondPointer];
				secondPointer--;
			}
			source[secondPointer + 1] = currentElement;
		}
		System.out.println(Arrays.toString(source));
	}

	private static void getSortedElements(int[] source) {
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
