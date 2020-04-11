package com.leet.string;

import java.util.Arrays;

public class ReverseOfString {

	public static void main(String[] args) {
		String source = "hello";
		usingCharArray(source);

	}

	private static void usingCharArray(String source) {
		char[] charSet = source.toCharArray();
		int start_pointer = 0;
		int end_pointer = charSet.length - 1;

		while (start_pointer < end_pointer) {

			char temp = charSet[start_pointer];
			charSet[start_pointer++] = charSet[end_pointer];
			charSet[end_pointer--] = temp;
		}
		System.out.println(Arrays.toString(charSet));

//		System.out.println(charSet[i++] + "" + charSet[j--]); post inccrement concept
//		System.out.println(charSet[i] + "" + charSet[j]);

	}

}
