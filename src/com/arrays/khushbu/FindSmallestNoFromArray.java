package com.arrays.khushbu;

public class FindSmallestNoFromArray {

	public static void main(String[] args) {
		int[] inputArray = { 10, 2, 3, -10, 5 };

		int smallestNo = inputArray[0];
		int largestNo = inputArray[0];
		int currenttNo;

		for (int i = 0; i < inputArray.length; i++) {
			currenttNo = inputArray[i];
			smallestNo = getSmallerNo(smallestNo, currenttNo);
			largestNo = getLargerNo(largestNo, currenttNo);
		}

		System.out.println(smallestNo);
		System.out.println(largestNo);

	}

	private static int getLargerNo(int largestNo, int currenttNo) {
		if (currenttNo > largestNo) {
			largestNo = currenttNo;
		}
		return largestNo;
	}

	private static int getSmallerNo(int smallestNo, int currenttNo) {
		if (currenttNo < smallestNo) {
			smallestNo = currenttNo;
		}
		return smallestNo;
	}

}
