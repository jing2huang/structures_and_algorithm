package com.newer.structures.link;

/**
 * 单向循环链表（双端链表）
 * 
 * @author qinghua
 *
 */
public class MyCycleLinkList {
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
			root.next = root;
			count++;
			return;
		}
		count++;
		Node cur = root;
		node.next = root;
		while (cur.next != root)
			cur = cur.next;
		cur.next = node;
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
		if (cur == null) 
			return;
		while (cur.next != root) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.print(cur.data);
	}

	/*
	 * append(item) 链表尾部添加元素
	 */
	public void append(long item) {
		Node newNode = new Node(item);
		if (root == null) {
			count++;
			root = newNode;
		} else {
			Node cur = root;
			while (cur.next != root) {
				cur = cur.next;
			}
			count++;
			cur.next = newNode;
			newNode.next = root;
		}
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
			cur.next = node;
		}
		count++;
	}

	/*
	 * remove(item) 删除节点
	 */
	public void remove(long item) {
		Node cur = root;
		Node pre = root;
		if (item == cur.data) {
			if (root.next != root) {
				while (cur.next != root) 
					cur = cur.next;
				cur.next = root.next;
				root = cur.next;
			} else {
				root = null;
			}
			count--;
		} else {
			while (cur.next != root) {
				if (item == cur.data) {
					pre.next = cur.next;
					count--;
					return;
				}
				pre = cur;
				cur = cur.next;
			}
			if (item == cur.data) {
				pre.next = cur.next;
				count--;
			}
		}

	}
	
	/*
	 * search(item) 查找节点是否存在
	 */
	public boolean search(long item) {
		Node cur = root;
		if (!isEmpty())
			return false;
		while (cur.next != root) {
			if (cur.data == item) {
				return true;
			}
			cur = cur.next;
		}
		if (cur.data == item)
			return true;
		return false;
	}
}
