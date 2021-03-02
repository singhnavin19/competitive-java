package com.leet.array.easy;

public class SumOfOneDimesionalArray {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4 };
		int[] output;
		SumOfOneDimesionalArray s = new SumOfOneDimesionalArray();

		output = s.runningSum(input);
		System.out.println("----------");
		for (int i = 0; i < output.length; i++) {
			System.out.println(input[i] + " -- " + output[i]);
		}

	}

	public int[] runningSum(int[] nums) {
		for (int index = 1; index < nums.length; index++) {
			nums[index] += nums[index - 1];
		}

		return nums;
	}

}
