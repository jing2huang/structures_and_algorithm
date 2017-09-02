package com.newer.questionAlgo;

/**
 * 汉诺塔问题
 *	 A座上3个盘子（从上往下为小到大），B、C座上无盘子，	将A座上的盘子移到C座上，
 *移动过程中任意大盘子都不能放在小盘子之上	
 * @author qinghua
 *
 */
public class HanoiTowerDemo {
	public static void main(String[] args) {
		doTower(3, 'A', 'B', 'C');
	}

	/**
	 * 移动盘子
	 * @param topN 移动的盘子数
	 * @param from 起始塔座
	 * @param inter 中间塔座
	 * @param to 目标塔座
	 */
	public static void doTower(int topN, char from, char inter, char to) {
		if (topN == 1) {
			System.out.println("盘子1，从" + from + "塔座到" + to + "塔座");
		} else {
			doTower(topN - 1, from, to, inter);
			System.out.println("盘子" + topN + ",从" + from + "塔座到" + to + "塔座");
			doTower(topN - 1, inter, from, to);
		}
	}
}
