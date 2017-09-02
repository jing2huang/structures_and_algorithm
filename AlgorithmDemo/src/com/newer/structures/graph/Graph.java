package com.newer.structures.graph;

import com.newer.structures.MyQueue;
import com.newer.structures.MyStack;

/**
 * 图
 * 		包含图的深度（DFS）/广度（RFS）优先搜索实现
 * @author qinghua
 *
 */
public class Graph {
	//顶点数组
	private Vertex[] vertexList;
	//邻接矩阵
	private int[][] adjMat;
	//顶点的最大数目
	private int maxSize = 20;
	//当前顶点数
	private int nVertex;
	//栈
	private MyStack stack;
	//队列
	private MyQueue queue;
	
	public Graph() {
		vertexList = new Vertex[maxSize];
		adjMat = new int[maxSize][maxSize];
		for (int i = 0; i < maxSize; i++) {
			for (int j = 0; j < maxSize; j++) {
				adjMat[i][j] = 0;
			}
		}
		nVertex = 0;
		stack = new MyStack();
		queue = new MyQueue();
	}
	
	/**
	 * 添加顶点
	 */
	public void addVertex(char label) {
		vertexList[nVertex++] = new Vertex(label);
	}
	
	/**
	 * 添加边
	 */
	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	/**
	 * 寻找指定结点未访问过的结点
	 */
	public int getadjUnvisitedVertex(int v) {
		for (int i = 0; i < nVertex; i++) {
			if (adjMat[v][i] == 1 && vertexList[i].isVisited == false) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 搜索算法
	 * 	深度优先搜索（使用栈完成）
	 */
	public void dfs() {
		//首先访问0号顶点
		vertexList[0].isVisited = true;
		//显示该顶点
		displayVertex(0);
		//压入栈中
		stack.push(0);
		while (!stack.isEmpty()) {
			//获得一个未访问过的邻结点
			int v = getadjUnvisitedVertex((int)stack.peek());
			if (v == -1) {
				stack.pop();
			} else {
				vertexList[v].isVisited = true;
				displayVertex(v);
				stack.push(v);
			}
		}
		//搜索完以后，要将访问信息修改（相当于重新初始化）
		for (int i = 0; i < nVertex; i++) {
			vertexList[i].isVisited = false;
		}
	}
	
	/**
	 * 广度优先算法
	 */
	public void rfs() {
		//首先访问0号顶点
		vertexList[0].isVisited = true;
		//显示该顶点
		displayVertex(0);
		//压入队列
		queue.insert(0);
		while (!queue.isEmpty()) {
			//获得一个未访问过的邻结点
			int v = getadjUnvisitedVertex((int)queue.peek());
			if (v == -1) {
				queue.remove();
			} else {
				vertexList[v].isVisited = true;
				displayVertex(v);
				queue.insert(v);
			}
		}
		//搜索完以后，要将访问信息修改（相当于重新初始化）
		for (int i = 0; i < nVertex; i++) {
			vertexList[i].isVisited = false;
		}
	}
	
	public void displayVertex(int v) {
		System.out.print(vertexList[v].label); 
	}
}
