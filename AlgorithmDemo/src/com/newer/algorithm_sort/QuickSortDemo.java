package com.newer.algorithm_sort;

import java.util.Arrays;

/**
 * 快速排序
 * 
 * @author qinghua
 *
 */
public class QuickSortDemo {

	public static void main(String[] args) {
		//int[] num = { 17, 15,54, 226, 20, 16, 20, 77, 31, 44, 55, 20 };
		int[] num = new int[10];
		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 100);
		}
		System.out.println("排序前结果：" + Arrays.toString(num));
		//将最右端元素作为关键字
		//partition(num, 0, num.length - 1, num[num.length - 1]);
		sort(num, 0, num.length - 1);
		System.out.println("排序后结果：" + Arrays.toString(num));

	}

	/**
	 * 划分数组
	 * 
	 * @param arr
	 * @param left
	 * @param right
	 * @param point 关键值
	 */
	public static int partition(int[] arr, int left, int right, int point) {
		int leftPtr = left - 1;
		int rightPtr = right;
		while (true) {
			//循环，将比关键字小的留在左端
			while (leftPtr < rightPtr && arr[++leftPtr] < point);
			//循环，将比关键字大的留在右端
			while (leftPtr < rightPtr && arr[--rightPtr] > point);
			if (leftPtr >= rightPtr) {
				break;
			} else {
				int temp = arr[leftPtr];
				arr[leftPtr] = arr[rightPtr];
				arr[rightPtr] = temp;
			}
		}
		//将关键字和当前所指leftPtr的进行交换
		int temp = arr[leftPtr];
		arr[leftPtr] = arr[right];
		arr[right] = temp;
		return leftPtr;
	}
	
	public static void sort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		//设置关键字
		int point = arr[right];
		//获得切入点，同时对数组进行划分
		int partition = partition(arr, left, right, point);
		//对左边的子数组进行快速排序
		sort(arr, left, partition - 1);
		//对右边的子数组进行快速排序
		sort(arr, partition + 1, right);
		
	}
}
