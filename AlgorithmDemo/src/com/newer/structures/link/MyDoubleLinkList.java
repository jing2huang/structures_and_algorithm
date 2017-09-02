package com.newer.structures.link;

/**
 * 双向链表实现
 * 
 * @author qinghua
 *
 */
public class MyDoubleLinkList {
	// 头结点
	private Node root;
	
	private int count;

	/*
	 * is_empty() 链表是否为空
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/*
	 * add(item) 链表头部添加元素
	 */
	public void add(long item) {
		Node node = new Node(item);
		if (root == null) {
			root = node;
			count++;
			return;
		}
		count++;
		node.next = root;
		root.pre = node;
		root = node;
	}

	/*
	 * length() 链表长度
	 */
	public int length() {
		return count;
	}

	/*
	 * travel() 遍历整个链表
	 */
	public void trval() {
		Node cur = root;
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
	}

	/*
	 * append(item) 链表尾部添加元素
	 */
	public void append(long item) {
		Node newNode = new Node(item);
		if (root == null) {
			root = newNode;
		} else {
			Node cur = root;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
			newNode.pre = cur;
		}
		count++;
	}

	/*
	 * insert(pos, item) 指定位置添加元素
	 */
	public void insert(int pos, long item) {
		if (pos <= 0) {
			add(item);
		} else if (pos > (length() - 1)) {
			append(item);
		} else {
			int curPos = 0;
			Node node = new Node(item);
			Node cur = root;
			while (curPos < (pos - 1)) {
				curPos++;
				cur = cur.next;
			}
			node.next = cur.next;
			cur.next.pre = node;
			cur.next = node;
			node.pre = cur;
		}
		count++;
	}

	/*
	 * remove(item) 删除节点
	 */
	public void remove(long item) {
		Node cur = root;
		Node pre = root;
		while (cur != null) {
			if (item == cur.data) {
				if (root.data == item) {
					root = cur.next;
					count--;
				} else {
					pre.next = cur.next;
					cur.next.pre = pre;
					count--;
				}
				break;
			}
			pre = cur;
			cur = cur.next;
		}
	}
	
	/*
	 * search(item) 查找节点是否存在
	 */
	public boolean search(long item) {
		Node cur = root;
		while (cur != null) {
			if (cur.data == item) {
				return true;
			}
			cur = cur.next;
		}
		return false;
	}
}
