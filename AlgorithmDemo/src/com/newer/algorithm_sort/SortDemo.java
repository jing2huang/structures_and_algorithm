package com.newer.algorithm_sort;

/**
 * 冒泡排序
 * 
 * @author qinghua
 *
 */
public class SortDemo {

	public static void main(String[] args) {
		int[] num = { 22, 10, 18, 5, 28, 39, 12 };

		for (int i = 0; i < num.length; i++) {
			int temp = 0;
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j + 1];
					num[j + 1] = num[j];
					num[j] = temp;
				}
			}
		}
		// 5 10 12 18 22 28 39
		System.out.println("排序后结果：");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
