package com.newer.structures.test;

import com.newer.structures.link.LinkList;
import com.newer.structures.link.MyCycleLinkList;
import com.newer.structures.link.MyDoubleLinkList;
import com.newer.structures.link.MyLinkList;
import com.newer.structures.link.Node;

public class TestLinkList {
	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		test4();
	}
	
	public static void test4() {
		MyCycleLinkList mList = new MyCycleLinkList();
		mList.add(12);
		mList.add(13);
		mList.trval();
		System.out.println("\n此时链表长度：" + mList.length());
		mList.append(25);
		mList.trval();
		System.out.println("\n此时链表长度：" + mList.length());
		System.out.println(mList.search(23));
		mList.insert(1, 23);
		mList.trval();
		System.out.println("\n此时链表长度：" + mList.length());
		mList.remove(13);
		mList.trval();
		System.out.println("\n此时链表长度：" + mList.length());
	}
	
	public static void test3() {
		MyDoubleLinkList mList = new MyDoubleLinkList();
		mList.add(12);
		mList.add(13);
		mList.trval();
		System.out.println("\n此时链表长度：" + mList.length());
		mList.append(25);
		mList.trval();
		System.out.println("\n此时链表长度：" + mList.length());
		System.out.println(mList.search(23));
		mList.insert(1, 23);
		mList.trval();
		System.out.println("\n此时链表长度：" + mList.length());
		mList.remove(13);
		mList.trval();
		System.out.println("\n此时链表长度：" + mList.length());
	}

	public static void test2() {
		MyLinkList mList = new MyLinkList();
		mList.add(12);
		mList.add(13);
		mList.trval();
		System.out.println("\n此时链表长度：" + mList.length());
		mList.append(25);
		mList.trval();
		System.out.println("\n此时链表长度：" + mList.length());
		System.out.println(mList.search(23));
		mList.insert(1, 23);
		mList.trval();
		System.out.println("\n此时链表长度：" + mList.length());
		mList.remove(13);
		mList.trval();
		System.out.println("\n此时链表长度：" + mList.length());
	}

	public static void test1() {
		LinkList linkList = new LinkList();
		linkList.insertFirst(34);
		linkList.insertFirst(44);
		linkList.insertFirst(55);
		
		linkList.display();
	
		//linkList.deleteFirst();
		System.out.println();
		
		Node node = linkList.search(44);
		node.display();
		System.out.println();
		Node node1 = linkList.delete(44);
		node1.display();
		System.out.println();
		Node node2 = linkList.search(55);
		node2.display();
		System.out.println();
		linkList.display();
	}
}
