package com.newer.structures;

/**
 * 队列实现
 * 
 * @author qinghua
 *
 */
public class MyQueue {
	private long[] arr;
	//有效数据大小
	private int elements;
	//队头
	private int front;
	//队尾
	private int end;
	
	public MyQueue() {
		arr = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}
	
	public MyQueue(int maxSize) {
		arr = new long[maxSize];
		elements = 0;
		front = 0;
		end = -1;
	}
	
	/**
	 * 添加数据，从队尾插入
	 */
	public void insert(long value) {
		arr[++end] = value;
		elements++;
	}
	
	/**
	 * 删除数据，从队头删除(从队头出数据)
	 */
	public long remove() {
		elements--;
		return arr[front++];
	}
	
	/**
	 * 判断是否为空
	 */
	public boolean isEmpty() {
		return elements == 0;
	}
	
	public long peek() {
		return arr[front];
	}
	
	/**
	 * 判断是否满了
	 */
	public boolean isFull() {
		return elements == arr.length;
	}
}
