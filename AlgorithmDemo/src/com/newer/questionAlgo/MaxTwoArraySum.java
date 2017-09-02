package com.newer.questionAlgo;

/**
 * 互斥的两个子序列最大和
 * 
 * @author qinghua
 *
 */
public class MaxTwoArraySum {
	public static void main(String[] args) {
		int[] n = { -1, 2, 3, 4, -5, 3, -2, 4, -2, 3 };
		System.out.printf("两个子元素的最大和：%d", maxSum(n));

	}

	private static int maxSum(int[] n) {
		if (n == null || n.length < 2) {
			return 0;
		}
		int[] h = new int[n.length];
		h[n.length - 1] = n[n.length - 1];
		int cur = n[n.length - 1];
		for (int i = n.length - 2; i >= 0; i--) {
			cur = cur < 0 ? 0 : cur;
			cur += n[i];
			h[i] = Math.max(h[i + 1], cur);
		}
		int res = n[0] + h[1];
		int lMax = n[0];
		cur = n[0];
		for (int i = 1; i < n.length - 1; i++) {
			cur = cur < 0 ? 0 : cur;
			cur += n[i];
			lMax = Math.max(lMax, cur);
			res = Math.max(res, lMax + h[i + 1]);
		}
		return res;

		/*
		 * int res = 0; int[] h = new int[n.length]; //int max = n[n.length -
		 * 1]; //int cur = n[n.length - 1]; int max = 0; int cur = 0; for (int i
		 * = n.length - 1; i >= 0; i--) { cur = cur < 0 ? 0 : cur; cur += n[i];
		 * max = Math.max(cur, max); h[i] = max; } max = 0; cur = 0; for (int i
		 * = 0; i < n.length - 1; i++) { cur = cur < 0 ? 0 : cur; cur += n[i];
		 * max = Math.max(cur, max); res = Math.max(res, max + h[i + 1]); }
		 * return res;
		 */
	}
}
