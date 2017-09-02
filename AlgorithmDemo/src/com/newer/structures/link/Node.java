package com.newer.structures.link;

/**
 * 结点类
 * 
 * @author qinghua
 *
 */
public class Node {
	//数据域
	public long data;
	//结点域/指针域（下一个数据的引用）
	public Node next;
	//上一个数据的引用
	public Node pre;
	
	public Node(long value) {
		this.data = value;
	}
	
	/**
	 * 显示方法
	 */
	public void display() {
		System.out.print(data + " ");
	}
}
