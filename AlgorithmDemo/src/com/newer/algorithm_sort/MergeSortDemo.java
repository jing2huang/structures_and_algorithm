package com.newer.algorithm_sort;

import java.util.Arrays;

/**
 *归并排序
 * 
 * @author qinghua
 *
 */
public class MergeSortDemo {

	public static void main(String[] args) {
		int[] num = { 54, 226, 93, 17, 77, 31, 44, 55, 20 };
		
		int[] temArray = new int[num.length];
		mergeSort(num, temArray, 0, num.length - 1);
		
		System.out.println("排序后结果：" + Arrays.toString(num));

	}

	//将原数组从中间递归两两拆分
	private static void mergeSort(int[] num, int[] temArray, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			mergeSort(num, temArray, left, center);
			mergeSort(num, temArray, center + 1, right);
			merge(num, temArray, left, center + 1, right);
		}
	}

	//归并排序
	private static void merge(int[] num, int[] temArray, int leftPos, int rightPos, int rightEnd) {
		int leftEnd = rightPos - 1;
		int temPos = leftPos;
		int numElem = rightEnd - leftPos + 1;
		
		while (leftPos <= leftEnd && rightPos <= rightEnd) {
			if (num[leftPos] <= num[rightPos]) {
				temArray[temPos++] = num[leftPos++];
			} else {
				temArray[temPos++] = num[rightPos++];
			}
		}
		
		while (leftPos <= leftEnd) {
			temArray[temPos++] = num[leftPos++];
		}
		
		while (rightPos <= rightEnd) {
			temArray[temPos++] = num[rightPos++];
		}
		
		for (int i = 0; i < numElem; i++) {
			num[rightEnd] = temArray[rightEnd];
			rightEnd--;
		}
		//System.out.println("num:" + Arrays.toString(num));
		//System.out.println("tem:" + Arrays.toString(temArray));
	}
	
}
