package com.newer.questionAlgo;
/**
 * 距离最近的两点xxxx
 * 
 * @author qinghua
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		//保存点的坐标
		int[][] n = {{1,1}, {2, 2}, {4, 1}, {5, 3}, {9, 9}};
		
		int x2 = 0; int x1 = 0;
		int lmax = 0;
		for (int i = 0; i < n.length; i++) {
			
			for (int j = i + 1; j < n.length; j++) {
				if (((n[i][0] - n[j][0])*(n[i][0] - n[j][0]) + (n[i][1] - n[j][1])*(n[i][1] - n[j][1])) > lmax) {
					x1 = i;
					x2 = j;
					lmax = (n[i][0] - n[j][0])*(n[i][0] - n[j][0]) + (n[i][1] - n[j][1])*(n[i][1] - n[j][1]);
				}
			}
			
		}
		System.out.printf("距离最远的两点为:(%d, %d), (%d, %d)", n[x1][0], n[x1][1], n[x2][0], n[x2][1]);

	}

}
