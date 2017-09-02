package com.newer.algorithm_sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 
 * @author qinghua
 *
 */
public class SortDemo01 {

	public static void main(String[] args) {
		int[] num = { 54, 226, 93, 17, 77, 31, 44, 55, 20 };
		//54 226 93 17 77 31 44 55 20
		//54 		   77		   20		对子序列进行插入排序
		//   226		  31
		//		 93			 44
		//			17			55
		//重复此操作
		for (int gap = num.length/2; gap > 0; gap /= 2) {
			for (int i = gap; i < num.length; i++) {
				for (int j = i; j >= gap; j -= gap ) {
					if (num[j] < num[j - gap]) {
						int temp = num[j - gap];
						num[j - gap] = num[j];
						num[j] = temp;
					}
				}
			}
		}
		
		System.out.println("排序后结果：" + Arrays.toString(num));

	}

}
