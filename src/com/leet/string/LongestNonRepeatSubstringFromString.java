package com.leet.string;

import java.util.HashSet;

public class LongestNonRepeatSubstringFromString {

	public static void main(String[] args) {
		String source = "hello";
		usingHashSet(source);
		usingArray(source);
//		int[] a = new int[128];
//		a['z'] = 2;
//
//		for (int j : a) {
////			System.out.println(a['z']);
//			System.out.print(j);
//		}

	}

	private static void usingArray(String source) {
		int maxLenght = 0;
		int[] index = new int[128];

		for (int i = 0, j = 0; j < source.length(); j++) {
			i = Math.max(index[source.charAt(j)], i);
			maxLenght = Math.max(maxLenght, j - i + 1);
			index[source.charAt(j)] = j + 1;
		}
		System.out.println("length of longest Substring using Array:- " + maxLenght);

	}

	public static void usingHashSet(String source) {
		int a_pointer = 0;
		int b_pointer = 0;
		int maxLength = 0;
		HashSet<Character> set = new HashSet<>();

		while (b_pointer < source.length()) {
			if (!set.contains(source.charAt(b_pointer))) {
				set.add(source.charAt(b_pointer));
				maxLength = Math.max(maxLength, set.size());
				b_pointer++;
			} else {
				set.remove(source.charAt(a_pointer));
				a_pointer++;
			}
		}
		System.out.println("length of longest Substring Using *HashSet* :- " + maxLength);
	}
}
