package com.newer.questionAlgo;

import java.util.Scanner;

/**
 * 指定长度的最大子序列
 * 
 * @author qinghua
 *
 */
public class MaxLenDemo {
	public static void main(String[] args) {
		int[] n = { 3, 2, 1, 1, 1, 1, 1, 3, 2 };

		System.out.print("输入一个k值：");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		int left = 0;
		int right = 0;
		int sum = n[0];
		int maxLen = 0;
		while (right <= n.length) {
			if (sum < k) {
				right++;
				if (right == n.length) {
					break;
				}
				sum += n[right];
			} else if (sum == k) {
				maxLen = Math.max(maxLen, right - left + 1);
				sum -= n[left++];
			} else {
				sum -= n[left++];
			}
		}
		System.out.println(maxLen);
	}
}
