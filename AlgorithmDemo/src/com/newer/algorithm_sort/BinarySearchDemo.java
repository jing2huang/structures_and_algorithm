package com.newer.algorithm_sort;

/**
 * 二分查找
 * 
 * @author qinghua
 *
 */
public class BinarySearchDemo {

	public static void main(String[] args) {
		int[] num = { 17, 20, 31, 44, 54, 55, 77, 93, 226 };

		System.out.println(binarySearch(22, num, 0, num.length - 1) ? "元素存在" : "元素不存在");
		System.out.println(binarySearch(num, 17) ? "元素存在" : "元素不存在");
	}

	// 递归法
	private static boolean binarySearch(int item, int[] num, int left, int right) {
		int mid = (left + right) / 2;
		if (left <= right) {
			if (num[mid] < item) {
				// System.out.println(num[mid] + "*");
				return binarySearch(item, num, ++mid, right);
			} else if (num[mid] > item) {
				// System.out.println(num[mid] + "-");
				return binarySearch(item, num, left, --mid);
			} else {
				return true;
			}
		}
		return false;
	}

	// 非递归法
	private static boolean binarySearch(int[] num, int item) {
		int first = 0;
		int last = num.length - 1;
		while (first <= last) {
			int mid = (first + last) / 2;
			if (item < num[mid]) {
				last = mid - 1;
			} else if (item > num[mid]) {
				first = mid + 1;
			} else {
				return true;
			}
		}
		return false;

	}
}
