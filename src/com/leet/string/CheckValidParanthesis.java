package com.leet.string;

import java.util.Scanner;
import java.util.Stack;

public class CheckValidParanthesis {

	public static void main(String[] args) {
		String input = "";
		System.out.println("Please enter input string");

		try (Scanner sc = new Scanner(System.in)) {
			input = sc.nextLine();
		}

		System.out.println(isValidParanthesis(input));
	}

	public static boolean isValidParanthesis(String input) {
		Stack<Character> stack = new Stack<>();

		for (char c : input.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && '(' == stack.peek()) {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && '{' == stack.peek()) {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && '[' == stack.peek()) {
				stack.pop();
			} else {
				return false;
			}
		}

		return stack.isEmpty();
	}

}
