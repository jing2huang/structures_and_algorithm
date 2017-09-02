package com.newer.structures.test;

import com.newer.structures.tree.BinaryTree;
import com.newer.structures.tree.Node;

public class TestTree {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.add(23);
		tree.add(2);
		tree.add(13);
		tree.add(12);
		tree.add(33);
		tree.add(1);
		tree.add(14);
		
		/*System.out.println(tree.root.data);
		System.out.println(tree.root.lChild.data);
		System.out.println(tree.root.lChild.rChild.data);
		System.out.println(tree.root.rChild.data);
		System.out.println(tree.root.lChild.rChild.rChild.data);
		
		System.out.println(tree.search(3));*/
		
		/*tree.frontOrder(tree.root);
		System.out.println();
		tree.centerOrder(tree.root);
		System.out.println();
		tree.lastOrder(tree.root);*/
		//tree.remove(1);
		tree.remove(13);
		tree.lastOrder(tree.root);
		
	}
}
