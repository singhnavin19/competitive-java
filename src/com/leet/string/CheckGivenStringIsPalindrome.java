package com.leet.string;

public class CheckGivenStringIsPalindrome {

	public static void main(String[] args) {
		checkPalindrome("geekskeeg");
	}

	private static void checkPalindrome(String source) {
		int firstPointer = 0, secondPointer = source.length() - 1;
		int median = source.length() / 2;
		boolean isPalindrome = false;

		while (firstPointer <= median) {
			if (source.charAt(firstPointer++) == source.charAt(secondPointer--)) {
				isPalindrome = true;
				continue;
			}
			isPalindrome = false;
		}
		System.out.println(isPalindrome);
	}
}
