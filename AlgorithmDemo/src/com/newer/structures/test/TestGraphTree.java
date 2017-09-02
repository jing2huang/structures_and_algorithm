package com.newer.structures.test;

import com.newer.structures.graph.mini_spanning_tree.Graph;

public class TestGraphTree {
	public static void main(String[] args) {
		/*test1();
		System.out.println();
		test2();*/
		test3();
	}

	public static void test1() {
		Graph g = new Graph();
		g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
		g.addVertex('D');
		g.addVertex('E');
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(3, 4);
		
		g.mst1();
	}
	
	public static void test2() {
		Graph g = new Graph();
		g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
		g.addVertex('D');
		g.addVertex('E');
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		//g.addEdge(3, 4);
		
		g.mst1();
	}
	
	public static void test3() {
		Graph g = new Graph();
		g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
		g.addVertex('D');
		g.addVertex('E');
		g.addVertex('F');
		
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 5);
		g.addEdge(3, 4);
		
		System.out.print("mst1_DFS:");
		g.mst1();
		System.out.println();
		System.out.print("mst2_RFS:");
		g.mst2();
	}
}
