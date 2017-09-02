package com.newer.algorithm_sort;

import java.util.Arrays;

/**
 * 插入排序
 * 
 * @author qinghua
 *
 */
public class InsertSortDemo {

	public static void main(String[] args) {
		int[] num = { 54, 226, 93, 17, 77, 31, 44, 55, 20 };
		
		for (int i = 0; i < num.length; i ++) {
			int temp = 0;
			for (int j = i; j > 0; j--) {
				if (num[j] < num[j - 1]) {
					temp = num[j - 1];
					num[j - 1] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println("排序后结果：" + Arrays.toString(num));
		
	}

}
