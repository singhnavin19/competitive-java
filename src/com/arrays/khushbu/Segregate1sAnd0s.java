package com.arrays.khushbu;

public class Segregate1sAnd0s {

	private static int[] getSegeregatedArrays(int[] input) {
		int[] result = new int[input.length];
		int _1_index = input.length - 1;
		int _0_index = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] == 1) {
				result[_1_index] = input[index];
				_1_index--;
			} else {
				result[_0_index] = input[index];
				_0_index++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int input[] = { 1, 0, 1, 1, 0, 0, 1, 1 };

		int[] result = getSegeregatedArrays(input);

		for (int index = 0; index < result.length; index++) {
			System.out.println(result[index]);
		}
	}

}
