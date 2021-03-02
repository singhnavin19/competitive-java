package com.leet.integer;

import java.util.Scanner;

public class FizzBuzzProblem {

	public static void main(String[] args) {

		System.out.println("Please enter n value");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		for (int i = 1; i <= no; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
