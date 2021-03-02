package com.leet.integer;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter no");
		int no = sc.nextInt();
		System.out.println(isPowerOfTwo(no));
		sc.close();
	}

	public static boolean isPowerOfTwo(int target) {
		int source = 1;

		while (source < target) {
			source *= 2;
		}

		return target == source;
	}
}
