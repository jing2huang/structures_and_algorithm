package com.newer.structures.test;

import com.newer.structures.MyStack;

public class TestMyStack {
	public static void main(String[] args) {
		MyStack ms = new MyStack(4);
		System.out.println(ms.isEmpty());
		ms.push(23);
		ms.push(5);
		ms.push(2);
		ms.push(230);
		
		System.out.println(ms.isEmpty());
		System.out.println(ms.isFull());
		
		System.out.println(ms.peek());
		System.out.println(ms.peek());
		
		while (!ms.isEmpty()) {
			System.out.print(ms.pop() + " ");
		}
	}
}
