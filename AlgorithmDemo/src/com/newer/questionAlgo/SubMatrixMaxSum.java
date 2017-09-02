package com.newer.questionAlgo;

/**
 * 最大子矩阵
 * 
 * @author qinghua
 *
 */
public class SubMatrixMaxSum {
	public static void main(String[] args) {
		int[][] n = { { 1, -1, 3, 2 }, { 2, -4, 1, -5 }, { -1, 3, 2, 4 }, { 5, 2, -2, 4 } };
		// int[][] n = {{2, 1, 1}, {-1, 2, 2}, {5, -4, 3}};
		int max = getMaxSum(n);
		System.out.printf("子矩阵中元素和最大为：%d", max);
	}

	private static int getMaxSum(int[][] n) {
		int cur = 0;
		int max = 0;
		int[] s = null;
		// 当矩阵行数大于列数的时候（想象成将此矩阵顺时针旋转90度），将列当作行用
		for (int i = 0; i < n.length; i++) {
			s = new int[n.length];
			for (int j = i; j < n.length; j++) {
				cur = 0;
				for (int z = 0; z < n.length; z++) {
					s[z] += n[j][z];
					cur += s[z];
					max = Math.max(cur, max);
					cur = cur < 0 ? 0 : cur;
				}
			}
		}
		return max;
	}
}
