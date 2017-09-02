package com.newer.structures.hashtable;

/**
 * 哈希表
 * 		采用开放地址法解决关键字散列后索引冲突
 * @author qinghua
 *
 */
public class HashTable01 {
	private Info[] arr;

	public HashTable01() {
		arr = new Info[100];
	}

	public HashTable01(int maxSize) {
		arr = new Info[maxSize];
	}

	/**
	 * 插入数据
	 * 
	 * @param info
	 */
	public void insert(Info info) {
		String key = info.getKey();
		int hashVal = hashCode(key);
		while (arr[hashVal] != null && arr[hashVal].getName() != null) {
			++hashVal;
			hashVal %= arr.length;
		}
		arr[hashVal] = info;
	}

	/**
	 * 查找数据
	 * 
	 * @param key
	 * @return
	 */
	public Info find(String key) {
		int hashVal = hashCode(key);
		while (arr[hashVal] != null) {
			if (arr[hashVal].getKey().equals(key)) {
				return arr[hashVal];
			}
			++hashVal;
			hashVal %= arr.length;
		}
		return null;
	}

	/**
	 * 删除数据
	 * @param key
	 * @return
	 */
	public Info delete(String key) {
		int hashVal = hashCode(key);
		while (arr[hashVal] != null) {
			if (arr[hashVal].getKey().equals(key)) {
				Info tmp = arr[hashVal];
				tmp.setName(null);
				return tmp;
			}
			++hashVal;
			hashVal %= arr.length;
		}
		return null;
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
