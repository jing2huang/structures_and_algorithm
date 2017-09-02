package com.newer.questionAlgo;

import java.util.Scanner;

/**
 * 台阶走法问题
 * 
 * @author qinghua
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("输入台阶数：");
		int n = s.nextInt();
		int sum = 0; 
		
		//记录走法数
		/*for (int i = 0; i < n/2 + 1; i++) {
			int a1 = n - 2*i;
			int a2 = i;
			int a3 = 1;
			//13 - 2*i + i(总共走的步数)
			int a = a1 + a2;
			int num = 1;
			//i用于表示走两阶的步数
			if (a2 > a1) {
				//走两阶的步数大于一阶的，只需考虑一阶步数所走的位置
				for (int j = 0; j < a1; j++){
					num *= a--;
					a3 *= (j + 1);
				}
				sum += (num/a3);
			} else {
				for (int j = 0; j < a2; j++) {
					num *= a--;
					a3 *= (j + 1);
				}
				sum += (num/a3);
			}
		}*/
		
		//sum = fun(n);
		//System.out.printf("走法共有：%d种", sum);
		System.out.printf("\n递归方法有：%d种", fun(n));
	}
	
	public static int fun(int n) {
		if (n == 1) 
			return 1;
		if (n == 2) 
			return 2;
		return fun(n - 1) + fun(n - 2);
	}
}
