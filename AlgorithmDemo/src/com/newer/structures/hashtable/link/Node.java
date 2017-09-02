package com.newer.structures.hashtable.link;

/**
 * 结点类
 * 
 * @author qinghua
 *
 */
public class Node {
	//数据域
	public Info info;
	//结点域/指针域（下一个数据的引用）
	public Node next;
	
	public Node(Info info) {
		this.info = info;
	}
	
}
