package com.newer.structures.tree;

/**
 * 二叉树 
 * 		广度优先遍历：可以使用队列实现
 * 
 * @author qinghua
 *
 */
public class BinaryTree {
	// 根结点
	public Node root;

	/**
	 * 添加结点
	 * 
	 * @param value
	 */
	public void add(long value) {
		Node newNode = new Node(value);
		Node cur = root;
		Node parent;
		while (true) {
			if (root == null) {
				root = newNode;
				return;
			}
			parent = cur;
			if (cur.data > value) {
				cur = cur.lChild;
				if (cur == null) {
					parent.lChild = newNode;
					return;
				}
			} else {
				cur = cur.rChild;
				if (cur == null) {
					parent.rChild = newNode;
					return;
				}
			}
		}
	}

	/**
	 * 是否包含结点
	 * 
	 * @param value
	 */
	public boolean contains(long value) {
		Node cur = root;
		while (cur.data != value) {
			if (cur.data > value) {
				cur = cur.lChild;
			} else {
				cur = cur.rChild;
			}
			if (cur == null) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 删除结点
	 * 
	 * @param value
	 */
	public boolean remove(long value) {
		Node cur = root;
		Node parent = root;
		boolean isLChild = true;
		while (cur.data != value) {
			parent = cur;
			if (cur.data > value) {
				cur = cur.lChild;
				isLChild = true;
			} else {
				cur = cur.rChild;
				isLChild = false;
			}
			if (cur == null) {
				return false;
			}
		}
		//删除叶子结点
		if (cur.lChild == null && cur.rChild == null) {
			if (cur == root) {
				root = null;
			} else if (isLChild) {
				parent.lChild = null;
			} else {
				parent.rChild = null;
			}
		} else if (cur.rChild == null) {
			//只有左子结点
			if (cur == root) {
				root = cur.lChild;
			} else if (isLChild) {
				parent.lChild = cur.lChild;
			} else {
				parent.rChild = cur.lChild;
			}
		} else if (cur.lChild == null) {
			//只有右子结点
			if (cur == root) {
				root = cur.rChild;
			} else if (isLChild) {
				parent.lChild = cur.rChild;
			} else {
				parent.rChild = cur.rChild;
			}
		} else {
			/*cur = findMin(cur.rChild);
			//有两个子节点
			if (isLChild) {
				parent.lChild = cur;
			} else {
				
			}*/
			Node successor = getSuccessor(cur);
			if (cur == root) {
				root = successor;
			} else if (isLChild) {
				parent.lChild = successor;
			} else {
				parent.rChild = successor;
			}
			successor.lChild =  cur.lChild;
		}
		return true;
	}
	
	public Node getSuccessor(Node delNode) {
		Node item = delNode;
		Node parent = delNode;
		Node cur = delNode.rChild;
		
		while (cur != null) {
			parent = item;
			item = cur;
			cur = cur.lChild;
		}
		if (item != delNode.rChild) {
			parent.lChild = item.rChild;
			item.rChild = delNode.rChild;
		}
		return item;
	}
	
	/**
	 * 查找最小结点			***************
	 * @param node
	 * @return
	 */
	public Node findMin(Node node) {
		if (node == null) {
			return null;
		} else if (node.lChild == null) {
			return node;
		}
		return findMin(node.lChild);
	}
	
	/**
	 * 遍历树
	 * 1，先序遍历	根--左--右
	 * 2，中序遍历    左--根--右
	 * 3，后序遍历    左--右--根
	 */
	public void frontOrder(Node cur) {
		if (cur == null)
			return;
		System.out.print(cur.data + " ");
		frontOrder(cur.lChild);
		frontOrder(cur.rChild);
	}
	
	public void centerOrder(Node cur) {
		if (cur == null) 
			return;
		centerOrder(cur.lChild);
		System.out.print(cur.data + " ");
		centerOrder(cur.rChild);
	}
	
	public void lastOrder(Node cur) {
		if (cur == null) 
			return;
		lastOrder(cur.lChild);
		lastOrder(cur.rChild);
		System.out.print(cur.data + " ");
	}
	
}