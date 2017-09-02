package com.newer.structures.hashtable;

public class TestHashTable {
	public static void main(String[] args) {
		HashTable01 ht = new HashTable01();
		ht.insert(new Info("abc", "张三"));
		ht.insert(new Info("ct", "李四"));
		ht.insert(new Info("a", "王五"));
		
		System.out.println(ht.find("ct").getName());
		System.out.println(ht.find("a").getName());
	}
}
