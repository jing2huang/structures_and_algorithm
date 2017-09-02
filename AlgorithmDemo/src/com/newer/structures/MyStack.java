package com.newer.structures;

/**
 * 栈实现
 * @author qinghua
 *
 */
public class MyStack {
	private long[] arr;
	private int top;// 栈顶

	/**
	 * 默认的构造方法
	 */
	public MyStack() {
		arr = new long[10];
		top = -1;
	}

	public MyStack(int maxSize) {
		arr = new long[maxSize];
		top = -1;
	}

	/**
	 * 压栈：添加数据
	 */
	public void push(int value) {
		arr[++top] = value;
	}
	
	/**
	 * 出栈：移除数据
	 * @return
	 */
	public long pop() {
		return arr[top--];
	}
	
	/**
	 * 查看数据
	 */
	public long peek() {
		return arr[top];
	}
	
	/**
	 * 判断是否为空
	 */
	public boolean isEmpty() {
		return top == -1;
	}
	
	/**
	 * 判断是否满了
	 */
	public boolean isFull() {
		return top == arr.length - 1;
	}
	
}
