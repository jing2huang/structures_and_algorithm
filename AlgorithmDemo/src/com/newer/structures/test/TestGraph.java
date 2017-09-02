package com.newer.structures.test;

import com.newer.structures.graph.Graph;

public class TestGraph {
	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
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
		
		g.dfs();
		System.out.println();
		g.rfs();
	}
}
