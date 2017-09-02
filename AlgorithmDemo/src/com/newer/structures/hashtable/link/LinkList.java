package com.newer.structures.hashtable.link;

/**
 * 链表1
 * 
 * @author qinghua
 *
 */
public class LinkList {
	// 头结点
	private Node first;

	public LinkList() {
		first = null;
	}

	/**
	 * 插入一个结点，在头结点之后插入
	 */
	public void insertFirst(Info info) {
		// 创建新结点
		Node node = new Node(info);
		if (first == null) {
			first = node;
			return;
		}
		node.next = first;
		first = node;
	}

	/**
	 * 删除一个结点,在头结点进行删除
	 */
	public Node deleteFirst() {
		Node node = first;
		first = node.next;
		return node;
	}


	/**
	 * 查找方法
	 */
	public Node search(String key) {
		Node current = first;
		while (!key.equals(current.info.getKey())) {
			if (current.next == null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}

	/**
	 * 根据数据域来进行删除
	 */
	public Node delete(String key) {
		Node current = first;
		Node previous = first;
		while (!key.equals(current.info.getKey())) {
			if (current.next == null) {
				return null;
			}
			previous = current;
			current = current.next;
		}
		if (current == first) {
			// 链表头就是目标元素
			first = first.next;
		} else {
			// 目标元素在中间
			previous.next = current.next;
		}
		return current;
	}
}
