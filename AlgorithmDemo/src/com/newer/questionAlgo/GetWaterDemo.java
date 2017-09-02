package com.newer.questionAlgo;

/**
 * 容器盛水问题
 * 
 * @author qinghua
 *
 */
public class GetWaterDemo {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 0, 4, 1, 0, 1, 3, 5, 1, 2, 3 };
		System.out.printf("能装水的容量为：%d", getWater(arr));
	}

	private static int getWater(int[] arr) {
		int lMax = arr[0];
		int rMax = arr[arr.length - 1];
		int lIndex = 0;
		int rIndex = arr.length - 1;
		int capacity = 0;
		while (lIndex <= rIndex) {
			if (lMax > rMax) {
				capacity += Math.max(0, rMax - arr[rIndex--]);
				rMax = Math.max(rMax, arr[rIndex]);
			} else {
				capacity += Math.max(0, lMax - arr[lIndex++]);
				lMax = Math.max(lMax, arr[lIndex]);
			}
		}
		return capacity;
	}
}
