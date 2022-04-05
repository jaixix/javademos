package oop3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Map<String,Integer> map1 = new TreeMap<String,Integer>();
		map1.put("John", 25);
		map1.put("Max", 21);
		map1.put("Jai", 22);
		System.out.println(map1);
		map1.replace("John", 222);
		System.out.println(map1);
		
	}
}
