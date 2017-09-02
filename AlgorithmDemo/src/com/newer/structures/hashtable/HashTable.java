package com.newer.structures.hashtable;

/**
 * 哈希表
 * 
 * @author qinghua
 *
 */
public class HashTable {
	private Info[] arr;

	public HashTable() {
		arr = new Info[100];
	}

	public HashTable(int maxSize) {
		arr = new Info[maxSize];
	}

	/**
	 * 插入数据
	 * 
	 * @param info
	 */
	public void insert(Info info) {
		arr[hashCode(info.getKey())] = info;
	}

	/**
	 * 查找数据
	 * 
	 * @param key
	 * @return
	 */
	public Info find(String key) {
		return arr[hashCode(key)];
	}

	/**
	 * 将字符串索引转化为hashCode
	 * 		1，将每个字符转化为ASCII相加（问题：若索引中有abc和bbb,其ascall值和相等，导致索引不为一）
	 * 		2，幂的连乘(问题:乘出的结果过大)
	 * 		3，在2的基础上压缩可选值(问题：如果索引字符串过于大，会超出数据类型的范围[使用BigInteger类]，取模后依然可能重复)
	 * 
	 * @param key
	 * @return
	 */
	public int hashCode(String key) {
		// 方式1
		/*
		 * int hashVal = 0; for (int i = key.length() - 1; i >= 0; i--) { int
		 * letter = key.charAt(i) - 96; hashVal += letter; } return hashVal;
		 */

		// 方式2
		int hashVal = 0;
		int pow = 1;
		for (int i = key.length() - 1; i >= 0; i--) {
			int letter = key.charAt(i) - 96;
			hashVal += letter * pow;
			// 26个字母加一个空格：27种情况
			pow *= 27;
		}
		return hashVal % arr.length;
	}
}
