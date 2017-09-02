package com.newer.algorithm_sort;

import java.util.Arrays;

/**
 * 选择排序
 * 
 * @author qinghua
 *
 */
public class SelectSortDemo {

	public static void main(String[] args) {

		int[] num = { 54, 226, 93, 17, 77, 31, 44, 55, 20 };

		for (int i = 0; i < num.length; i++) {
			int flag = i;
			int min = num[i];
			for (int j = i; j < num.length; j++) {
				if (min > num[j]) {
					min = num[j];
					flag = j;
				}
			}
			num[flag] = num[i];
			num[i] = min;
		}

		System.out.println("排序后结果：" + Arrays.toString(num));
		
	}
}
