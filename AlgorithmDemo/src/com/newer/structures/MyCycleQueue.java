package com.newer.structures;

/**
 * 循环队列实现
 * 
 * @author qinghua
 *
 */
public class MyCycleQueue {
	private long[] arr;
	//有效数据大小
	private int elements;
	//队头
	private int front;
	//队尾
	private int end;
	
	public MyCycleQueue() {
		arr = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}
	
	public MyCycleQueue(int maxSize) {
		arr = new long[maxSize];
		elements = 0;
		front = 0;
		end = -1;
	}
	
	/**
	 * 添加数据，从队尾插入
	 */
	public void insert(long value) {
		if (end == arr.length - 1) {
			end = -1;
		}
		arr[++end] = value;
		elements++;
	}
	
	/**
	 * 删除数据，从队头删除(从队头出数据)
	 */
	public long remove() {
		long value = arr[front++];
		if (front == arr.length) {
			front = 0;
		}
		elements--;
		return value;
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
