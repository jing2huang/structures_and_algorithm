package com.newer.structures.test;

import com.newer.structures.hashtable.link.HashTable;
import com.newer.structures.hashtable.link.Info;

public class TestHashTable {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		
		ht.insert(new Info("ct", "李四"));
		ht.insert(new Info("a", "王五"));
		ht.insert(new Info("c", "赵六"));
		ht.insert(new Info("d", "钱七"));
	
		/*System.out.println(ht.hashCode("ct"));
		System.out.println(ht.hashCode("a"));
		System.out.println(ht.hashCode("c"));
		System.out.println(ht.hashCode("d"));*/
		
		System.out.println(ht.find("ct").getName());
		System.out.println(ht.find("a").getName());
		//System.out.println(ht.delete("c").getName());
		System.out.println(ht.find("c").getName());
		//System.out.println(ht.find("d").getName());
	
	}
}
