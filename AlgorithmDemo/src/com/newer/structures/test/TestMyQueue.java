package com.newer.structures.test;

import com.newer.structures.MyCycleQueue;
import com.newer.structures.MyQueue;

public class TestMyQueue {
	public static void main(String[] args) {
		MyCycleQueue mq = new MyCycleQueue(4);
		System.out.println(mq.isEmpty());
		mq.insert(23);
		mq.insert(13);
		mq.insert(33);
		mq.insert(73);
		
		System.out.println(mq.isEmpty());
		System.out.println(mq.isFull());
		System.out.println(mq.peek());
		System.out.println(mq.remove());
		System.out.println(mq.peek());
		
		while (!mq.isEmpty()) {
			System.out.print(mq.remove() + " ");
		}
		System.out.println();
		mq.insert(23);
		mq.insert(13);
		mq.insert(33);
		mq.insert(73);
		mq.insert(713);
		mq.insert(723);
		while (!mq.isEmpty()) {
			System.out.print(mq.remove() + " ");
		}
	}
}
