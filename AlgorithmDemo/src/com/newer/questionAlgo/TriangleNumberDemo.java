package com.newer.questionAlgo;

/**
 * 递归
 * 	 第n项结果由n-1项值+n
 * @author qinghua
 *
 */
public class TriangleNumberDemo {
	public static void main(String[] args) {
		System.out.println("第100项的结果：" + triangle(500));;
	}

	private static int triangle(int num) {
		if (num == 1) {
			return 1;
		}
		return triangle(num - 1) + num;
	}
}
