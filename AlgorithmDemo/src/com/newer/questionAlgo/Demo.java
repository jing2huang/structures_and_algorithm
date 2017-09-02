package com.newer.questionAlgo;

public class Demo {

	public static void main(String[] args) {
		int[] n = {-1, 2, 3, 4, -5, 3, -2, 4, -2, 3};
		//保存结果
		/*
		//记录可能最大和的连续子元素的最大和
		int max = n[0];
		//寻找最大子元素和
		int cur = n[0];
		for (int i = 0; i < n.length; i++) {
			
			//cur += n[i];
			//if (cur >= 0) {
				//max = Math.max(cur, max);
			//} else {
				//cur = 0;
			//}
			cur = cur < 0 ? 0 : cur;
			cur += n[i];
			max = Math.max(cur, max);
		}
		*/
		int max = 0;
		for (int i = 0; i < n.length; i++) {
			int str = 0;
			for (int j = i; j < n.length; j++) {
				str += n[j];
				max = (max < str) ? str : max;
			}
		}
		System.out.printf("连续子元素最大和为：%d", max);
	}

}
