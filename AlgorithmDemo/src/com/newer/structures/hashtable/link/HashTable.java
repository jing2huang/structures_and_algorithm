package com.newer.structures.hashtable.link;

/**
 * 哈希表
 * 		采用链地址法解决关键字散列后索引冲突
 * @author qinghua
 *
 */
public class HashTable {
	//数组对应的每一个存储单元都是一个链表
	private LinkList[] arr;

	public HashTable() {
		arr = new LinkList[100];
	}

	public HashTable(int maxSize) {
		arr = new LinkList[maxSize];
	}

	/**
	 * 插入数据
	 * 
	 * @param info
	 */
	public void insert(Info info) {
		String key = info.getKey();
		int hashVal = hashCode(key);
		if (arr[hashVal] == null) {
			arr[hashVal] = new LinkList();
		}
		arr[hashVal].insertFirst(info);
	}

	/**
	 * 查找数据
	 * 
	 * @param key
	 * @return
	 */
	public Info find(String key) {
		int hashVal = hashCode(key);
		return arr[hashVal].search(key).info;
	}

	/**
	 * 删除数据
	 * @param key
	 * @return
	 */
	public Info delete(String key) {
		int hashVal = hashCode(key);
		return arr[hashVal].delete(key).info;
	}
	
	/**
	 * 将字符串索引转化为hashCode
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

		// 方式2		使用BigInteger解决结果过大超出数据类型范围
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
